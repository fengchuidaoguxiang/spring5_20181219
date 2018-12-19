package register.service.impl;

import lombok.Setter;
import register.dao.IUserDAO;
import register.domain.User;
import register.service.IUserService;

public class UserServiceImpl implements IUserService {
    @Setter
    private IUserDAO dao;
    @Override
    public void register(User user) {
        System.out.println("注册操作");
        dao.save(user);
    }
}
