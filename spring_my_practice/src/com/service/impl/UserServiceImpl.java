package com.service.impl;

import com.dao.IUserDao;
import com.domain.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

//     @Autowired
     private IUserDao userDao;

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int save(User user) {
        System.out.println("注册操作");
        return userDao.save(user);
    }
}
