# 说明

下载地址：[https://github.com/protocolbuffers/protobuf/releases](https://github.com/protocolbuffers/protobuf/releases)

[protobuf-java-3.14.0.zip](protobuf-java-3.14.0.zip)是源码，应该用[protoc-3.14.0-win32.zip](protoc-3.14.0-win32.zip)

IDEA需要插件`Protocal Buffer Editor`的支持！

生成命令是：
```shell
protoc --java_out=./ PersonProto.proto
```

这里生成了一个`PersonProto.java`类，其中含有一个`Person`类，可用！
