package com.study.studyjvm.java;

import org.junit.Test;

/**
 * 字节码-验证、测试类
 */
public class ByteCodeInterview {
    // i++ 和 ++i 的区别
    @Test
    public void test1() {
        int i = 10;
        // 通过jclasslib查看字节码发现现在的两种写法没有区别
        // i++;
         ++i;
        System.out.println(i);
    }

    @Test
    public void test2() {
        int i = 10;
        i = i++;
        // 输出10
        System.out.println(i);
    }

    @Test
    public void test3() {
        int i = 10;
        i *= i++; // i = i * i++;
        // 输出100
        System.out.println(i);
    }

    @Test
    public void test4() {
        int k = 10;
        k = k + (k++) + (++k);
        // 输出32
        System.out.println(k);
    }

}
