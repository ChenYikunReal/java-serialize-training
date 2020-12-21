package org.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSerialize {

    private static final String PATH = "./file.dat";

    public static void main(String[] args) {
        // 创建对象
        Person obj = new Person(123, "Sam");
        System.out.println(obj);
        // 序列化写文件
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(PATH))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 反序列化读文件
        Person p = null;
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(PATH))) {
            p = (Person)ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(p);
    }

}
