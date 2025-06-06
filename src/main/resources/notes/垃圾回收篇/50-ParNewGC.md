# parNewGC
是serialGC的多线程版本。新生带使用多线程并发收集。  
老年代依然是单线程(老年代回收次数较少，使用单线程节省资源)。
![img.png](../images/jvm-50-01.png)