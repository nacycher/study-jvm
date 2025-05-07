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

    /**
     * 包装类对象的缓存问题
     */
    @Test
    public void test5() {
        // 查字节码发现是Integer.valueOf()方法
        // 存在缓存[-128,127]，如果在这个区间，就直接返回数组缓存中的对象
        Integer i = 10;
        Integer j = 10;
        // true
        System.out.println(i == j);

        Integer i1 = 128;
        Integer j1 = 128;
        // false
        System.out.println(i1 == j1);

        // 查字节码发现是Boolean.valueOf()方法
        // Boolean类型的valueOf()方法，返回的是一个Boolean类型的常量
        Boolean b1 = true;
        Boolean b2 = true;
        // true
        System.out.println(b1 == b2);
    }


    // jdk1.6中，字符串常量池在方法区中
    // jdk1.7以后，字符串常量池在堆中
    @Test
    public void test6() {
        String s1 = new String("hello") + new String("world");
        s1.intern();
        String s2 = "helloworld";
        // false, ture(s1.intern()方法返回的是常量池中的对象)
        System.out.println(s1 == s2);
    }

}
