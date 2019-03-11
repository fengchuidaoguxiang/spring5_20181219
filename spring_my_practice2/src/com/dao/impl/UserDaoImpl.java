package com.dao.impl;

import com.dao.IUserDao;
import com.domain.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;


public class UserDaoImpl implements IUserDao {
    DataSource myDataSource;
    @Override
    public int save(User user) {
        try(Connection conn = myDataSource.getConnection()) {
            String sql = "insert into user(id,name,age) values(?,?,?)";

        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void setMyDataSource(DataSource myDataSource) {
        this.myDataSource = myDataSource;
    }
}
