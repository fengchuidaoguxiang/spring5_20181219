package com.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ValueBean {
    @Value("${server.port}")
     int port;

    public ValueBean(){
        System.out.println("创建对象。。。。");
    }

    @PostConstruct
    public void begin(){
        System.out.println("begin....");
    }
    @PreDestroy
    public void end(){
        System.out.println("end.....");
    }

    public void dowork(){
        System.out.println("do work...");
    }
}
