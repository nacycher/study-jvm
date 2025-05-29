package com.study.studyjvm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * clone并不会复制对象的引用，而是复制对象的内容
 * 浅复制：只复制对象的基本类型和字符串类型，不会复制对象的引用
 * 深复制：复制对象的所有内容，包括对象的引用
 */
public class DemoTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Teacher teacher = new Teacher(1, "abc");
        Teacher t2 =  teacher.clone();
        System.out.println(teacher);
        System.out.println(t2);

        t2.setName("ccc");
        System.out.println(teacher);
        System.out.println(t2);
    }


}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Teacher implements Cloneable{
    private int id;
    private String name;

    @Override
    public Teacher clone() throws CloneNotSupportedException {
        return (Teacher) super.clone(); // 浅复制
    }
}