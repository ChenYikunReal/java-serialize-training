package org.example;


import org.msgpack.MessagePack;

import java.io.IOException;

public class MsgPackDemo {

    public static void main(String[] args) throws IOException {
        // 创建对象
        Person obj = new Person(123, "Sam");
        System.out.println(obj);
        // 序列化
        MessagePack messagePack = new MessagePack();
        byte[] bytes = messagePack.write(obj);
        // 反序列化
        Person p = messagePack.read(bytes, Person.class);
        System.out.println(p);
    }

}
