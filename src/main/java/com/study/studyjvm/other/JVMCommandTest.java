package com.study.studyjvm.other;

/**
 * JVM调优中使用的参数
 */
public class JVMCommandTest {

    /**
     * jps jstat jstack jmap jinfo
     */
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                Thread.sleep(1000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
