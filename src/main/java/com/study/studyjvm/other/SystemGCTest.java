package com.study.studyjvm.other;

public class SystemGCTest {
    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("start");
        // 建议jvm进行垃圾回收，但不一定会执行
        new SystemGCTest();
        System.gc();
    }

    /**
     * 对象被gc之前会调用该方法
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("=======================");
        System.out.println("finalize");
    }
}
