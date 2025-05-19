# ClassLoader
负责加载class文件到内存中，并生成对应的Class对象。

## loaderClass方法
加载类的方法，先检查类是否已加载过，且先委托给父类加载（双亲委派机制）
![img.png](../images/jvm-14-01.png)

## findClass方法
一个空的方法，使用自定义ClassLoader时，需要重写这个方法。
![img.png](../images/jvm-14-02.png)

## defineClass方法
指定文件名，通过文件流的形式加载class文件。
![img.png](../images/jvm-14-03.png)
