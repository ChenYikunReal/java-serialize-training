package org.example;

// 必须手动import
import com.example.Person;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TIOStreamTransport;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ThriftDemo {

    public static void main(String[] args) throws TException, IOException {
        // 创建对象
        Person obj = new Person(123, "Sam");
        System.out.println(obj);
        // 序列化
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        obj.write(new TBinaryProtocol(new TIOStreamTransport(bout)));
        byte[] bytes = bout.toByteArray();
        bout.close();
        // 反序列化
        ByteArrayInputStream bin = new ByteArrayInputStream(bytes);
        Person p = new Person();
        p.read(new TBinaryProtocol(new TIOStreamTransport(bin)));
        bin.close();
        System.out.println(p);
    }

}
