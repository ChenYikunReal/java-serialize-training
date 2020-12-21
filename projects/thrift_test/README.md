# Thrift序列化的准备

定义IDL，文件类型`thrift`。

写好IDL以后，切到对应目录下执行如下命令注册类：
```shell
thrift --gen java Person.thrift
```

这狗东西得下载：[下载地址](https://thrift.apache.org/download)

注意添加到环境变量前要改名，把那个版本号去掉会比较好，即改为`thrift.exe`

运行报错：
```text
Internal error (java.lang.UnsupportedClassVersionError): com/intellij/plugins/thrift/jps/ModelSerializerExtension has been compiled by a more recent version of the Java Runtime (class file version 55.0), this version of the Java Runtime only recognizes class file versions up to 52.0
```

看来是差了三个版本，那就应该是JDK11！

还报错：
```text
SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder".
SLF4J: Defaulting to no-operation (NOP) logger implementation
SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
```

那就是缺了Slf4j的依赖，补上！
