package org.example;

import java.io.*;

public class JdkSerializeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // 创建对象
        Person obj = new Person(123, "Sam");
        System.out.println(obj);
        // 序列化
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bout);
        out.writeObject(obj);
        byte[] bytes = bout.toByteArray();
        // 反序列化
        ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
        System.out.println(in.readObject());
    }

}
