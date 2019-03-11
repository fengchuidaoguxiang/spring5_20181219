package com.controller;

import com.domain.User;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    @Autowired
    private IUserService service;

    public int execute(){
        System.out.println("注册请求");
        User user = new User(20L,"MyKitty",20);
        return service.save(user);

    }

    public void setService(IUserService service) {
        this.service = service;
    }

    public IUserService getService() {
        return service;
    }
}
