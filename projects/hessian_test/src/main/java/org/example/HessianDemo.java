package org.example;

import com.caucho.hessian.io.Hessian2Input;
import com.caucho.hessian.io.Hessian2Output;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class HessianDemo {

    public static void main(String[] args) throws IOException {
        // 创建对象
        Person obj = new Person(123, "Sam");
        System.out.println(obj);
        // 序列化
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        Hessian2Output out = new Hessian2Output(os);
        out.startMessage();
        out.writeObject(obj);
        out.completeMessage();
        out.flush();
        byte[] bytes = os.toByteArray();
        out.close();
        os.close();
        // 反序列化
        ByteArrayInputStream ins = new ByteArrayInputStream(bytes);
        Hessian2Input input = new Hessian2Input(ins);
        input.startMessage();
        Person p = (Person)input.readObject();
        System.out.println(p);
        input.completeMessage();
        input.close();
        ins.close();
    }

}
