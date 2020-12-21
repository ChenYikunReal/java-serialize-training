package org.example;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.serializers.JavaSerializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

public class KryoDemo {

    public static void main(String[] args) {
        // 创建对象
        Person obj = new Person(123, "Sam");
        System.out.println(obj);
        // 注册实体类
        Kryo kryo = new Kryo();
        kryo.register(Person.class, new JavaSerializer());
        // 序列化
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Output output = new Output(os);
        kryo.writeObject(output, obj);
        byte[] bytes = os.toByteArray();
        // 反序列化
        Input input = new Input(new ByteArrayInputStream(bytes));
        Person p = kryo.readObject(input, Person.class);
        System.out.println(p);
    }

}
