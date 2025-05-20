package com.study.studyjvm.java3;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class UserDefineClassLoader extends ClassLoader{

    private String rootPath;

    public UserDefineClassLoader(String rootPath) {
        this.rootPath = rootPath;
    }

    /**
     * 重写findClass方法，定义自己的类加载器
     * @param name
     */
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        // 根据包名获取class文件路径
        String filePath = classToFilePath(name);
        // 获取二进制流数据
        byte[] data = getBytesFromPath(filePath);
        // 调用defineClass方法，将二进制流数据转换为Class对象
        return defineClass(name, data, 0, data.length);
    }

    private byte[] getBytesFromPath(String filePath) {
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        try {
            fis = new FileInputStream(filePath);
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            return baos.toByteArray();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null) {
                    baos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return null;
    }

    private String classToFilePath(String name) {
        return rootPath + "\\" + name.replace(".", "\\") + ".class";
    }


    public static void main(String[] args) {
        try {
            UserDefineClassLoader loader1 = new UserDefineClassLoader("C:\\Users\\Administrator\\IdeaProjects\\study-jvm\\target\\classes");
            Class userClass1 = loader1.findClass("com.study.studyjvm.eneity.User");

            UserDefineClassLoader loader2 = new UserDefineClassLoader("C:\\Users\\Administrator\\IdeaProjects\\study-jvm\\target\\classes");
            Class userClass2 = loader2.findClass("com.study.studyjvm.eneity.User");

            // userClass1 和 userClass2 是两个不同的类，因为它们是由不同的类加载器加载的
            // 同级别之间(自定义类加载器)，类加载的隔离
            System.out.println(userClass1 == userClass2);

            System.out.println(userClass1.getClassLoader());
            System.out.println(userClass1.getClassLoader().getParent());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
