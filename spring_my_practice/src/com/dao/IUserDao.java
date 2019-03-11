package com.dao;

import com.domain.User;

import java.util.List;

public interface IUserDao {
    public int save(User user);
    public int update(User user);
    public User get(long id);
    public List<User> listAll();
}
