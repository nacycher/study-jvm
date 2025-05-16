package com.study.studyjvm.java2;

public class T {
    /**
     * 静态变量赋值，静态代码块(不涉及final)，这4块将放在clinit()方法中执行
     */
    public static int k = 0;
    // 调用了构造方法，会去执行init方法，init方法会变量赋值和执行构造代码块
    public static T t1 = new T("t1");
    public static T t2 = new T("t2");
    public static int i = print("i");
    public static int n = 99;
    static {
        print ("静态块");
    }

    /**
     * 普通变量赋值，非静态代码块，构造方法。这3块将放在init()方法中执行
     */
    public int j = print("j");
    {
        print ("构造块");
    }
    public T (String str) {
        System.out.println ((++k) + ":" + str + "i=" + i + "n=" + n);
        ++n;
        ++i;
    }

    public static int print (String str) {
        System.out.println ((++k) + ":" + str + "i=" + i + "n=" + n);
        ++n;
        return ++i;
    }

    // 作为程序入口，执行类的main方法时，将会完成类加载过程，
    public static void main (String[] args) {
    }

}