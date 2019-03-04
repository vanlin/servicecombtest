package me.vanlin.test.service;

import org.apache.servicecomb.provider.pojo.RpcSchema;

@RpcSchema(schemaId = "test")
public class ServiceImplement implements ServiceInterface{

    @Override
    public String sayHi(String name) {
        return "hi!" + name;
    }
}
