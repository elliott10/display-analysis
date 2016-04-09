# 测试报告

- 测试环境: Ubuntu15.10 
- CPU  : Intel，
- 显卡  : AMD
- 工具: Unigine valley

测内核版本及结果
 
   - ####  kernel 4.4 basic 1280*720模式， 结果 ![](http://i4.piimg.com/b151af9a3db3b765.png)
  
   
   - ####  kernel 4.5  basic 1280*720模式 ， 结果![](http://i4.piimg.com/ed1dbf6de1d20675.png)
  
   - ####  kernel 4.5  custom 1440*900模式 ， 结果![](http://i4.piimg.com/ece1f511b5494c1d.png)
  
  
## 分析
   通过对比发现，不同内核，在basic 模式下
- 同：内核4.4和4.5的跑分，每秒帧数和最大帧数都接近
- 异： 在每秒传输的最小帧上内核4.4为16.2，比内核4.5的每秒5.8帧快。
- 结论: 在4.5和4.4内核上，使用AMD显卡，性能并没有明显的提升。


在同内核4.5下，使用不用的模式
- 相比basic模式，在custom模式下MIN FPS基本相同，但是 Score ,FPS, Max FPS，均明显下降。这样也说明在提高分辨率情况下，GPU效率明下降。
  








