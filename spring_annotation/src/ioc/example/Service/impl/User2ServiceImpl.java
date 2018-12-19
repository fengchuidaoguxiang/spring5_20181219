package ioc.example.Service.impl;

import ioc.example.Dao.IUser2Dao;
import ioc.example.Domain.User2;
import ioc.example.Service.IUser2Service;
import lombok.Setter;

public class User2ServiceImpl implements IUser2Service {
    @Setter
    private IUser2Dao dao;

    @Override
    public void insertService(User2 user2) {
        System.out.println("Service层插入数据");
        dao.insert(user2);
    }
}
