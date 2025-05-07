package com.study.studyjvm.java;

class Father {
    int x = 10;
    public Father() {
        this.print();
        x = 20;
    }
    public void print() {
        System.out.println("Father.x=" + x);
    }
}

class Son extends Father {
    int x = 30;
    public Son() {
        this.print();
        x = 40;
    }
    public void print() {
        System.out.println("Son.x=" + x);
    }
}

public class ByteCodeInterview1 {
    public static void main(String[] args) {
        /**
         * 1.先执行父类的构造方法，this.print(),调用的是this(子类)的方法,
         * 还没完成初始化，此时x=0
         * 2.执行子类自己的构造方法，输出30
         * 3.输出父类x的值，20
         */
        Father father = new Son();
        System.out.println(father.x);
    }
}
