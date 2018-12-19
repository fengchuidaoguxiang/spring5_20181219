package ioc_annotation.example.Service.impl;

import ioc_annotation.example.Dao.IUser2Dao;
import ioc_annotation.example.Domain.User2;
import ioc_annotation.example.Service.IUser2Service;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class User2ServiceImpl implements IUser2Service {
    @Autowired
    private IUser2Dao dao;

    @Override
    public void insertService(User2 user2) {
        System.out.println("Service层插入数据");
        dao.insert(user2);
    }
}
