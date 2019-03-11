package com.test;

import com.domain.Employee;
import com.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:application-context.xml")
public class MyTest {

    @Autowired
    private IEmployeeService service;

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
