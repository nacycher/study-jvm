package com.study.studyjvm.java3;

import org.junit.Test;

public class InterviewTest {

    @Test
    public void test() {
        Integer x = 128;
        int y = 128;
        System.out.println(x == y);// 自动拆箱
    }

    @Test
    public void test1() {
        // 先将5入操作数栈，然后将操作数栈中的5赋值给局部变量表中的a
        int a = 5;
    }
}
