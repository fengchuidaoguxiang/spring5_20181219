package com.test;

import com.service.IAccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:application-context.xml")
public class MyTest {
    @Autowired
    IAccountService accountService;

    @Test
    public void test1(){
        accountService.trans(10010,10086,500);
    }
}
