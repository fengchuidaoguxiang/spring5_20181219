package com.service.impl;

import com.service.IUserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements IUserService {
    @Override
    public void add() {
        System.out.println("---service----");
//        int i = 1/0;
    }
}
