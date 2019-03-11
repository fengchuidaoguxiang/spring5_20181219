package com.test;

import com.config.MyApplicationConfig;
import com.domain.Employee;
import com.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration(classes = MyApplicationConfig.class)
public class MyTest {

    @Autowired
    private EmployeeServiceImpl service;

    @Test
    public void test1(){
        System.out.println(service.getClass());
        System.out.println(service);
        service.save(new Employee());
    }

    @Test
    public void test2(){
        service.update(new Employee());
    }
}
