package com.study.studyjvm.java3;

public class ClassLoaderTest {
    public static void main(String[] args) {
        // 1.获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // 2.获取父类：扩展类加载器
        ClassLoader extendClassLoader = systemClassLoader.getParent();
        // 3.获取父类：启动类加载器 (使用C++编写，无法获取)
        ClassLoader bootstrapClassLoader = extendClassLoader.getParent();

        System.out.println(systemClassLoader);
        System.out.println(extendClassLoader);
        System.out.println(bootstrapClassLoader);
    }
}

