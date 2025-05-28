# MinorGC MajorGC FullGC
- minorGC收集新生代
- majorGC/oldGc收集老年代, **只有CMS GC会单独收集老年代**
- fullGC收集整个堆，所以大多时候majorGC和fullGC是一起的

## MinorGC
触发条件：
  - Eden区满了
大多数(80%)对象都是朝生夕灭的，所以MinorGC会频繁触发，MinorGC的效率相对较高的。

## MajorGC
触发条件：
- 老年代满了
- 方法区满了
- System.gc()调用，会考虑触发FullGC
- 对象分配内存中，from区放到to区放不下，放到老年代，还是放不下，会触发FullGC

当老年代空间不足时，会触发MajorGC，如果空间还是不足才会触发MajorGC。  
如果MajorGC后，空间还是不足，会报OOM error


## OOM如何解决
检查是内存泄漏还是内存溢出
- 内存泄漏：
- 内存溢出：
- 检查是否有大对象，对象存活时间过长，是否有大对象的引用关系不对。

