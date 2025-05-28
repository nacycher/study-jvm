package com.study.studyjvm.heap;

/**
 *
 * -Xms60m -Xmx60m -XX:NewRatio=2 -XX:SurvivorRatio=5 -XX:+PrintGCDetails -XX:+PrintHeapAtGC
 */
public class YongOldAreaTest {
    public static void main(String[] args) {
        byte[] buffer = new byte[1024 * 1024 * 20];
    }

}
