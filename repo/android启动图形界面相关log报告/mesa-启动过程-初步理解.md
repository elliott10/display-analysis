###参照
- [1][mesa源码分析](http://www.cnblogs.com/zale_lzj/archive/2010/11/29/1889424.html)

##xwindow部分

>对于glut使用的是XMesaMakeCurrent2与mesa实现ctx[struct gl_context]的同步
>android 的log显示android好像使用一个eglMakeCurrent来与mesa的ctx实现同步

>这个函数调用_mesa_make_current,初次调用会生成一个struct gl_context context对象，整个mesa的核心。
>同时这个函数中会对context的api分发表进行初始化_glapi_set_dispatch.
>初始化context的读写buffer对象。
>同时初始化坐标空间数组与裁剪坐标空间数组。
>这个函数会作为同步接口周期性调用

```c
/**
 * Bind the given context to the given drawBuffer and readBuffer and
 * make it the current context for the calling thread.
 * We'll render into the drawBuffer and read pixels from the
 * readBuffer (i.e. glRead/CopyPixels, glCopyTexImage, etc).
 *
 * We check that the context's and framebuffer's visuals are compatible
 * and return immediately if they're not.
 *
 * \param newCtx  the new GL context. If NULL then there will be no current GL
 *                context.
 * \param drawBuffer  the drawing framebuffer
 * \param readBuffer  the reading framebuffer
 */
GLboolean
_mesa_make_current( struct gl_context *newCtx,
                    struct gl_framebuffer *drawBuffer,
                    struct gl_framebuffer *readBuffer )
{
   GET_CURRENT_CONTEXT(curCtx);

   if (MESA_VERBOSE & VERBOSE_API)
      _mesa_debug(newCtx, "_mesa_make_current()\n");

   /* Check that the context's and framebuffer's visuals are compatible.
    */
   if (newCtx && drawBuffer && newCtx->WinSysDrawBuffer != drawBuffer) {
      if (!check_compatible(newCtx, drawBuffer)) {
         _mesa_warning(newCtx,
              "MakeCurrent: incompatible visuals for context and drawbuffer");
         return GL_FALSE;
      }
   }
   if (newCtx && readBuffer && newCtx->WinSysReadBuffer != readBuffer) {
      if (!check_compatible(newCtx, readBuffer)) {
         _mesa_warning(newCtx,
              "MakeCurrent: incompatible visuals for context and readbuffer");
         return GL_FALSE;
      }
   }

   if (curCtx && 
       (curCtx->WinSysDrawBuffer || curCtx->WinSysReadBuffer) &&
       /* make sure this context is valid for flushing */
       curCtx != newCtx &&
       curCtx->Const.ContextReleaseBehavior ==
       GL_CONTEXT_RELEASE_BEHAVIOR_FLUSH)
      _mesa_flush(curCtx);

   /* We used to call _glapi_check_multithread() here.  Now do it in drivers */
   _glapi_set_context((void *) newCtx);
   assert(_mesa_get_current_context() == newCtx);

   if (!newCtx) {
      _glapi_set_dispatch(NULL);  /* none current */
   }
   else {
      _glapi_set_dispatch(newCtx->CurrentDispatch);

      if (drawBuffer && readBuffer) {
         assert(_mesa_is_winsys_fbo(drawBuffer));
         assert(_mesa_is_winsys_fbo(readBuffer));
         _mesa_reference_framebuffer(&newCtx->WinSysDrawBuffer, drawBuffer);
         _mesa_reference_framebuffer(&newCtx->WinSysReadBuffer, readBuffer);

         /*
          * Only set the context's Draw/ReadBuffer fields if they're NULL
          * or not bound to a user-created FBO.
          */
         if (!newCtx->DrawBuffer || _mesa_is_winsys_fbo(newCtx->DrawBuffer)) {
            _mesa_reference_framebuffer(&newCtx->DrawBuffer, drawBuffer);
            /* Update the FBO's list of drawbuffers/renderbuffers.
             * For winsys FBOs this comes from the GL state (which may have
             * changed since the last time this FBO was bound).
             */
            _mesa_update_draw_buffers(newCtx);
         }
         if (!newCtx->ReadBuffer || _mesa_is_winsys_fbo(newCtx->ReadBuffer)) {
            _mesa_reference_framebuffer(&newCtx->ReadBuffer, readBuffer);
         }

         /* XXX only set this flag if we're really changing the draw/read
          * framebuffer bindings.
          */
   newCtx->NewState |= _NEW_BUFFERS;

         if (drawBuffer) {
            _mesa_check_init_viewport(newCtx,
                                      drawBuffer->Width, drawBuffer->Height);
         }
      }

      if (newCtx->FirstTimeCurrent) {
         handle_first_current(newCtx);
   newCtx->FirstTimeCurrent = GL_FALSE;
      }
   }
   
   return GL_TRUE;
}

```


##glBegin
>一些设置或清理的gl函数都设置ctx[struct gl_context]属性或对一些属性置空。
>***mesa维护一个ctx全局的变量，对于参数设置都在ctx发生变化，
>最后再调用执行函数，以管道形式绘制图形不同属性***

####glBegin被设置为一个函数的别名，同时调用save_Begin

```c
KEYWORD1 void KEYWORD2 NAME(Begin)(GLenum mode)
{
    (void) mode;
   DISPATCH(Begin, (mode), (F, "glBegin(0x%x);\n", mode));
}
```

####调用一个save_Begin函数，其中调用vbo_exec_Begin

```c
static void GLAPIENTRY
save_Begin(GLenum mode)
{
   GET_CURRENT_CONTEXT(ctx);

   if (!_mesa_is_valid_prim_mode(ctx, mode)) {
      /* compile this error into the display list */
      _mesa_compile_error(ctx, GL_INVALID_ENUM, "glBegin(mode)");
   }
   else if (_mesa_inside_dlist_begin_end(ctx)) {
      /* compile this error into the display list */
      _mesa_compile_error(ctx, GL_INVALID_OPERATION, "recursive glBegin");
   }
   else {
      Node *n;

      ctx->Driver.CurrentSavePrimitive = mode;

      /* Give the driver an opportunity to hook in an optimized
       * display list compiler.
       */
      if (ctx->Driver.NotifySaveBegin(ctx, mode))
         return;

      SAVE_FLUSH_VERTICES(ctx);
      n = alloc_instruction(ctx, OPCODE_BEGIN, 1);
      if (n) {
         n[1].e = mode;
      }

      if (ctx->ExecuteFlag) {
         CALL_Begin(ctx->Exec, (mode));#调用vbo_exec_Begin
      }
   }
}
```

####vbo_exec_Begin 主要进行ctx的设置与更新。

```sh
/**
 * Called via glBegin.
 */
static void GLAPIENTRY vbo_exec_Begin( GLenum mode )
{
   GET_CURRENT_CONTEXT( ctx ); 
   struct vbo_exec_context *exec = &vbo_context(ctx)->exec;
   int i;

   if (_mesa_inside_begin_end(ctx)) {
      _mesa_error(ctx, GL_INVALID_OPERATION, "glBegin");
      return;
   }

   if (!_mesa_valid_prim_mode(ctx, mode, "glBegin")) {
      return;
   }

   vbo_draw_method(vbo_context(ctx), DRAW_BEGIN_END);

   if (ctx->NewState) {
      _mesa_update_state( ctx );

      CALL_Begin(ctx->Exec, (mode));
      return;
   }

   if (!_mesa_valid_to_render(ctx, "glBegin")) {
      return;
   }

   /* Heuristic: attempt to isolate attributes occurring outside
    * begin/end pairs.
    */
   if (exec->vtx.vertex_size && !exec->vtx.attrsz[0])
      vbo_exec_FlushVertices_internal(exec, GL_FALSE);

   i = exec->vtx.prim_count++;
   exec->vtx.prim[i].mode = mode;#i类似栈的形式，glbegin会被多次调用
   exec->vtx.prim[i].begin = 1;
   exec->vtx.prim[i].end = 0;
   exec->vtx.prim[i].indexed = 0;
   exec->vtx.prim[i].weak = 0;
   exec->vtx.prim[i].pad = 0;
   exec->vtx.prim[i].start = exec->vtx.vert_count;
   exec->vtx.prim[i].count = 0;
   exec->vtx.prim[i].num_instances = 1;
   exec->vtx.prim[i].base_instance = 0;
   exec->vtx.prim[i].is_indirect = 0;

   ctx->Driver.CurrentExecPrimitive = mode;

   ctx->Exec = ctx->BeginEnd;
   /* We may have been called from a display list, in which case we should
    * leave dlist.c's dispatch table in place.
    */
   if (ctx->CurrentDispatch == ctx->OutsideBeginEnd) {
      ctx->CurrentDispatch = ctx->BeginEnd;
      _glapi_set_dispatch(ctx->CurrentDispatch);
   } else {
      assert(ctx->CurrentDispatch == ctx->Save);
   }
}


```

##绘图
####以glVertex3f 为例

> glVertex3f会被设置为一个函数并调用_save_Vertex3f

```sh
KEYWORD1 void KEYWORD2 NAME(Vertex3f)(GLfloat x, GLfloat y, GLfloat z)
{
    (void) x; (void) y; (void) z;
   DISPATCH(Vertex3f, (x, y, z), (F, "glVertex3f(%f, %f, %f);\n", x, y, z));
}
```

####当前的上下文中TAG定义如下

```sh
#define TAG(x) _save_##x
```

####TAG(Vertex3f) 也就是_save_Vertex3f，具体定义如下

```sh
static void GLAPIENTRY
TAG(Vertex3f)(GLfloat x, GLfloat y, GLfloat z)
{
   GET_CURRENT_CONTEXT(ctx);
   ATTR3F(VBO_ATTRIB_POS, x, y, z);//VBO_ATTRIB_POS定义时候为0
}
```

####ATTR3F的宏定义如下

```sh
	#define ATTR3F( A, X, Y, Z )    ATTRF( A, 3, X, Y, Z, 1 )

	#define ATTRF( A, N, V0, V1, V2, V3 ) \
    		ATTR_UNION(A, N, GL_FLOAT, fi_type, FLOAT_AS_UNION(V0), FLOAT_AS_UNION(V1),\
            	FLOAT_AS_UNION(V2), FLOAT_AS_UNION(V3))

	typedef union { GLfloat f; GLint i; GLuint u; } fi_type;
```

> 一层套一层最后在ATTR_UNION这个宏中实现数据存储。

```sh
#define ATTR_UNION( A, N, T, C, V0, V1, V2, V3 )                        \
do {                  \
   struct vbo_exec_context *exec = &vbo_context(ctx)->exec;   \
   int sz = (sizeof(C) / sizeof(GLfloat));                              \
   if (unlikely(!(ctx->Driver.NeedFlush & FLUSH_UPDATE_CURRENT))) \
      ctx->Driver.BeginVertices( ctx );         \
                                                                        \
   if (unlikely(exec->vtx.active_sz[A] != N * sz) ||                    \
       unlikely(exec->vtx.attrtype[A] != T))                            \
      vbo_exec_fixup_vertex(ctx, A, N * sz, T);                         \
                                                                        \
   {                  \
      C *dest = (C *)exec->vtx.attrptr[A];                              \
      if (N>0) dest[0] = V0;            \
      if (N>1) dest[1] = V1;            \
      if (N>2) dest[2] = V2;            \
      if (N>3) dest[3] = V3;            \
      exec->vtx.attrtype[A] = T;          \
   }                  \
                  \
   if ((A) == 0) {              \
      /* This is a glVertex call */         \
      GLuint i;               \
                  \
      for (i = 0; i < exec->vtx.vertex_size; i++)     \
   exec->vtx.buffer_ptr[i] = exec->vtx.vertex[i];     \
                  \
      exec->vtx.buffer_ptr += exec->vtx.vertex_size;      \
                  \
      /* Set FLUSH_STORED_VERTICES to indicate that there's now */  \
      /* something to draw (not just updating a color or texcoord).*/ \
      ctx->Driver.NeedFlush |= FLUSH_STORED_VERTICES;     \
                  \
      if (++exec->vtx.vert_count >= exec->vtx.max_vert)     \
   vbo_exec_vtx_wrap( exec );         \
   }                  \
} while (0)
```

##glEnd()

####通过以下方式将mesa对应的end函数设置别名glEnd();

```C
KEYWORD1 void KEYWORD2 NAME(End)(void)
{
 DISPATCH(End, (), (F, "glEnd();\n"));
}
```

####接着调用一个save_End函数在这个函数中调用vbo_exec_End(位于vbo_exec_api.h)
> vbo_exec_End的核心操作是vbo_exec_vtx_flush


```C
static void GLAPIENTRY vbo_exec_End( void )
{
   GET_CURRENT_CONTEXT( ctx );
   struct vbo_exec_context *exec = &vbo_context(ctx)->exec;

   if (!_mesa_inside_begin_end(ctx)) {
      _mesa_error(ctx, GL_INVALID_OPERATION, "glEnd");
      return;
   }

   ctx->Exec = ctx->OutsideBeginEnd;
   if (ctx->CurrentDispatch == ctx->BeginEnd) {
      ctx->CurrentDispatch = ctx->OutsideBeginEnd;
      _glapi_set_dispatch(ctx->CurrentDispatch);
   }

   if (exec->vtx.prim_count > 0) {
      /* close off current primitive */
      int idx = exec->vtx.vert_count;
      int i = exec->vtx.prim_count - 1;
      exec->vtx.prim[i].end = 1;
      exec->vtx.prim[i].count = idx - exec->vtx.prim[i].start;
      try_vbo_merge(exec);
   }

   ctx->Driver.CurrentExecPrimitive = PRIM_OUTSIDE_BEGIN_END;

   if (exec->vtx.prim_count == VBO_MAX_PRIM)
      vbo_exec_vtx_flush( exec, GL_FALSE );

   if (MESA_DEBUG_FLAGS & DEBUG_ALWAYS_FLUSH) {
      _mesa_flush(ctx);
   }
}
```

####vbo_exec_vtx_flush
> 在vbo_exec_vtx_flush调用管道绘制函数。
> 核心操作为TNL_CONTEXT(ctx)->Driver.RunPipeline(ctx);进入管道绘制。

```c
/* This is the main entrypoint into the slimmed-down software tnl
 * module.  In a regular swtnl driver, this can be plugged straight
 * into the vbo->Driver.DrawPrims() callback.
 */
void _tnl_draw_prims(struct gl_context *ctx,
			 const struct _mesa_prim *prim,
			 GLuint nr_prims,
			 const struct _mesa_index_buffer *ib,
			 GLboolean index_bounds_valid,
			 GLuint min_index,
			 GLuint max_index,
			 struct gl_transform_feedback_object *tfb_vertcount,
                         unsigned stream,
			 struct gl_buffer_object *indirect)
{
   TNLcontext *tnl = TNL_CONTEXT(ctx);
   const struct gl_client_array **arrays = ctx->Array._DrawArrays;
   const GLuint TEST_SPLIT = 0;
   const GLint max = TEST_SPLIT ? 8 : tnl->vb.Size - MAX_CLIPPED_VERTICES;
   GLint max_basevertex = prim->basevertex;
   GLuint i;

   if (!index_bounds_valid)
      vbo_get_minmax_indices(ctx, prim, ib, &min_index, &max_index, nr_prims);

   /* Mesa core state should have been validated already */
   assert(ctx->NewState == 0x0);

   if (!_mesa_check_conditional_render(ctx))
      return; /* don't draw */

   for (i = 1; i < nr_prims; i++)
      max_basevertex = MAX2(max_basevertex, prim[i].basevertex);

   if (0)
   {
      printf("%s %d..%d\n", __func__, min_index, max_index);
      for (i = 0; i < nr_prims; i++)
	 printf("prim %d: %s start %d count %d\n", i,
		_mesa_enum_to_string(prim[i].mode),
		prim[i].start,
		prim[i].count);
   }

   if (min_index) {
      /* We always translate away calls with min_index != 0.
       */
      vbo_rebase_prims( ctx, arrays, prim, nr_prims, ib,
			min_index, max_index,
			_tnl_draw_prims );
      return;
   }
   else if ((GLint)max_index + max_basevertex > max) {
      /* The software TNL pipeline has a fixed amount of storage for
       * vertices and it is necessary to split incoming drawing commands
       * if they exceed that limit.
       */
      struct split_limits limits;
      limits.max_verts = max;
      limits.max_vb_size = ~0;
      limits.max_indices = ~0;

      /* This will split the buffers one way or another and
       * recursively call back into this function.
       */
      vbo_split_prims( ctx, arrays, prim, nr_prims, ib,
		       0, max_index + prim->basevertex,
		       _tnl_draw_prims,
		       &limits );
   }
   else {
      /* May need to map a vertex buffer object for every attribute plus
       * one for the index buffer.
       */
      struct gl_buffer_object *bo[VERT_ATTRIB_MAX + 1];
      GLuint nr_bo = 0;
      GLuint inst;

      for (i = 0; i < nr_prims;) {
	 GLuint this_nr_prims;

	 /* Our SW TNL pipeline doesn't handle basevertex yet, so bind_indices
	  * will rebase the elements to the basevertex, and we'll only
	  * emit strings of prims with the same basevertex in one draw call.
	  */
	 for (this_nr_prims = 1; i + this_nr_prims < nr_prims;
	      this_nr_prims++) {
	    if (prim[i].basevertex != prim[i + this_nr_prims].basevertex)
	       break;
	 }

         assert(prim[i].num_instances > 0);

	 /* Binding inputs may imply mapping some vertex buffer objects.
	  * They will need to be unmapped below.
	  */
         for (inst = 0; inst < prim[i].num_instances; inst++) {

            bind_prims(ctx, &prim[i], this_nr_prims);
            bind_inputs(ctx, arrays, max_index + prim[i].basevertex + 1,
                        bo, &nr_bo);
            bind_indices(ctx, ib, bo, &nr_bo);

            tnl->CurInstance = inst;
            TNL_CONTEXT(ctx)->Driver.RunPipeline(ctx);//核心

            unmap_vbos(ctx, bo, nr_bo);
            free_space(ctx);
         }

	 i += this_nr_prims;
      }
   }
}
```
####管道绘制
>上一步的RunPipeline会调用 _tnl_run_pipeline
>这个函数的核心操作是：
>struct tnl_pipeline_stage *s = &tnl->pipeline.stages[i]；
>if (!s->run( ctx, s )) 这里依据下面的数组管道执行
>可以看出是依次执行

```c
const struct tnl_pipeline_stage *_tnl_default_pipeline[] = {
   &_tnl_vertex_transform_stage,
   &_tnl_normal_transform_stage,
   &_tnl_lighting_stage,
   &_tnl_texgen_stage,
   &_tnl_texture_transform_stage,
   &_tnl_point_attenuation_stage,
   &_tnl_vertex_program_stage, 
   &_tnl_fog_coordinate_stage,
   &_tnl_render_stage,
   NULL 
};
```

```c
void _tnl_run_pipeline( struct gl_context *ctx )
{
   TNLcontext *tnl = TNL_CONTEXT(ctx);
   unsigned short __tmp;
   GLuint i;

   if (!tnl->vb.Count)
      return;

   /* Check for changed input sizes or change in stride to/from zero
    * (ie const or non-const).
    */
   if (check_input_changes( ctx ) || tnl->pipeline.new_state) {
      if (ctx->VertexProgram._MaintainTnlProgram)
	 _tnl_UpdateFixedFunctionProgram( ctx );

      for (i = 0; i < tnl->pipeline.nr_stages ; i++) {
	 struct tnl_pipeline_stage *s = &tnl->pipeline.stages[i];
	 if (s->validate)
	    s->validate( ctx, s );
      }
      
      tnl->pipeline.new_state = 0;
      tnl->pipeline.input_changes = 0;
      
      /* Pipeline can only change its output in response to either a
       * statechange or an input size/stride change.  No other changes
       * are allowed.
       */
      if (check_output_changes( ctx ))
	 _tnl_notify_pipeline_output_change( ctx );
   }

#ifndef _OPENMP
   /* Don't adjust FPU precision mode in case multiple threads are to be used.
    * This would require that the additional threads also changed the FPU mode
    * which is quite a mess as this had to be done in all parallelized sections;
    * otherwise the master thread and all other threads are running in different
    * modes, producing inconsistent results.
    * Note that all x64 implementations don't define/use START_FAST_MATH, so
    * this is "hack" is only used in i386 mode
    */
   START_FAST_MATH(__tmp);
#endif

   for (i = 0; i < tnl->pipeline.nr_stages ; i++) {
      struct tnl_pipeline_stage *s = &tnl->pipeline.stages[i];//核心	
      if (!s->run( ctx, s ))//执行核心
	 break;
   }

#ifndef _OPENMP
   END_FAST_MATH(__tmp);
#endif
}
```
