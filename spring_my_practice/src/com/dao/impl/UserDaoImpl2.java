package com.dao.impl;

import com.dao.IUserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("dao2")
public class UserDaoImpl2 implements IUserDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public int save(User user) {
        System.out.println("this is dao2...");
        String sql = "insert into user(id,name,age) values(:id,:name,:age)";
        Map<String,Object> params = new HashMap<>();
        params.put("id",user.getId());
        params.put("name",user.getName());
        params.put("age",user.getAge());
        return  this.jdbcTemplate.update(sql,params);
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public User get(long id) {
        return null;
    }

    @Override
    public List<User> listAll() {
        return null;
    }
}
