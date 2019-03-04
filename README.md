# skywalking 与 servicecomb整合异常演示



在启动类添加vm参数 TestApplication

```java

 -javaagent:D:/server/apache-skywalking-apm-incubating/agent-backend/skywalking-agent.jar 
```

如果plugins 包含  apm-spring-annotation-plugin-6.0.0-GA.jar 包

则会抛以下异常 原因是 schemaLoader未能注入

```java

Caused by: java.lang.NullPointerException: null
	at org.apache.servicecomb.core.definition.schema.ProducerSchemaFactory.createSchema(ProducerSchemaFactory.java:133) ~[java-chassis-core-1.1.0.jar:1.1.0]
```

