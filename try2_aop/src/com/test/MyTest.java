package com.test;

import com.config.AppConfig;
import com.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
//@ContextConfiguration("classpath:application-context.xml")
@ContextConfiguration(classes = AppConfig.class)
public class MyTest {
    @Autowired
    UserServiceImpl userService;

    @Test
    public void test1(){
        userService.add();
    }
}
