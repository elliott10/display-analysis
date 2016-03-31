
#    JDB调试



GDB四个方面的功能： 

1、启动你的程式，能按照你的自定义的需求随心所欲的运行程式。  

2、可让被调试的程式在你所指定的调置的断点处停住。（断点能是条件表达式） 

3、当程式被停住时，能检查此时你的程式中所发生的事。

4、动态的改动你程式的执行环境。

### 一、
一般来说GDB主要调试的是C/C++的程序。要调试C/C++的程序，首先在编译时，我们必须要把调试信息加到可执行文件中。使用编译器（cc/gcc/g++）的 -g 参数可以做到这一点。如：

sh ...

      #  gcc -g hello.c -o hello                          //编译成目标文件
...

### 二、启动GDB的方法有以下几种：
    1、gdb <program>   							// (gdb) ./hello -tui
       program也就是你的执行文件，一般在当前目录下。
    2、gdb <program> core
       用gdb同时调试一个运行程序和core文件，core是程序非法执行后core dump后产生的文件。
    3、gdb <program> <PID>
       如果你的程序是一个服务程序，那么你可以指定这个服务程序运行时的进程ID。gdb会自动attach上去，并调试他。program应该在PATH环境变量中搜索得到。
### 三、设置断点

	# b  n   (在第n行设置断点)
	#d b n    (删除第n行断点，没有n表示删除所有的断点)
	#disable b n  暂停断点
	#disable b n  回复暂停断点


 




### 四、常用的gdb命令 :
```sh
Backtrace: 显示程序中的当前位置和表示如何到达当前位置的栈跟踪（同义词：where）  
Run: 运行调试程序
breakpoint ： 在程序中设置一个断点  
cd : 改变当前工作目录  
clear:  删除刚才停止处的断点  
commands:  命中断点时，列出将要执行的命令  
continue:  从断点开始继续执行  
delete:  删除一个断点或监测点；也可与其他命令一起使用  display 程序停止时显示变量和表达时  
down: 下移栈帧，使得另一个函数成为当前函数  
frame: 选择下一条continue命令的帧  
info:  显示与该程序有关的各种信息 
jump:  在源程序中的另一点开始运行  
kill:  异常终止在gdb 控制下运行的程序  
list:  列出相应于正在执行的程序的原文件内容  
next: 执行下一个源程序行，从而执行其整体中的一个函数  
print:  显示变量或表达式的值  
pwd： 显示当前工作目录  
pype：显示一个数据结构（如一个结构或C++类）的内容  quit 退出gdb  
reverse-search： 在源文件中反向搜索正规表达式  run 执行该程序  
search：在源文件中搜索正规表达式  set variable 给变量赋值  
signal： 将一个信号发送到正在运行的进程  
step ：执行下一个源程序行，必要时进入下一个函数  
undisplay ：display命令的反命令，不要显示表达式  until 结束当前循环  
up：上移栈帧，使另一函数成为当前函数  
watch： 在程序中设置一个监测点（即数据断点）  whatis 显示变量或函数类型   
break： NUM 在指定的行上设置断点。  
Bt： 显示所有的调用栈帧。该命令可用来显示函数的调用顺序。  
Clear： 删除设置在特定源文件、特定行上的断点。其用法clear FILENAME:NUM  continue 继续执行正在调试的程序。该命令用在程序由于处理信号或断点而 导致停止运行时。  
display EXPR ：每次程序停止后显示表达式的值。表达式由程序定义的变量组成。  
file FILE： 装载指定的可执行文件进行调试。  
help NAME： 显示指定命令的帮助信息。  
info break： 显示当前断点清单，包括到达断点处的次数等。  
info files： 显示被调试文件的详细信息。 
info func： 显示所有的函数名称。  
info local 显示当函数中的局部变量信息。  
info prog 显示被调试程序的执行状态。  
info var 显示所有的全局和静态变量名称。  
kill 终止正被调试的程序。  
list 显示源代码段。  
make 在不退出 gdb 的情况下运行 make 工具。  
next 在不单步执行进入其他函数的情况下，向前执行一行源代码。  
print EXPR 显示表达式 EXPR 的值。
```

### Reference:

排版比较好的命令参考文档：http://www.jb51.net/article/36393.htm