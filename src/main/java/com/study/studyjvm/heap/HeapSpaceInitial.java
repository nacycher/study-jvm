package com.study.studyjvm.heap;

public class HeapSpaceInitial {
    public static void main(String[] args) {
        // 当前堆空间大小， 默认1/64
        long totalMemory = Runtime.getRuntime().totalMemory() / 1024 / 1024;
        // 最大堆空间大小，默认1/4
        long maxMemory = Runtime.getRuntime().maxMemory() / 1024 / 1024;

        System.out.println("当前堆空间大小：" + totalMemory);
        System.out.println("最大堆空间大小：" + maxMemory);
    }
}
