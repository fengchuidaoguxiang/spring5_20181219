package com.test;

import com.dao.IUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

//@Component
public class MyTest2 {
    @Autowired
    @Qualifier("dao2")
    private IUserDao userDao;
    public MyTest2(){
        System.out.println(userDao);
    }
}

