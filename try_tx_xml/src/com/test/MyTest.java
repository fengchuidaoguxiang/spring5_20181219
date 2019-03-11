package com.test;

import com.dao.IAccountDAO;
import com.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:application-context.xml")
public class MyTest {
    @Autowired
    IAccountDAO dao;

    @Autowired
    IAccountService service;

    @Test
    public void test1(){
       int result = dao.transIn(10010,500);
        System.out.println(result);
    }

    @Test
    public void test2(){
        int result = dao.transOut(10086,500);
        System.out.println(result);
    }

    @Test
    public void test3(){
        service.trans(10010,10086,500);

    }
}
