package org.example;

import com.google.protobuf.InvalidProtocolBufferException;
import org.example.PersonProto.Person;

public class ProtobufDemo {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        // 创建对象
        Person obj = Person.newBuilder().setId(123).setName("Sam").build();
        System.out.println(obj);
        // 序列化
        byte[] bytes = obj.toByteArray();
        // 反序列化
        Person p = Person.parseFrom(bytes);
        System.out.println(p);
    }

}
