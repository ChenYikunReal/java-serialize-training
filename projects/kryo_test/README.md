# 报错说明

```text
Exception in thread "main" java.lang.IllegalArgumentException: Class is not registered: org.example.Person
Note: To register this class use: kryo.register(org.example.Person.class);
	at com.esotericsoftware.kryo.Kryo.getRegistration(Kryo.java:512)
	at com.esotericsoftware.kryo.Kryo.writeObject(Kryo.java:560)
	at org.example.KryoDemo.main(KryoDemo.java:21)
```

缺下面的语句：
```java
kryo.register(Person.class, new JavaSerializer());
```
