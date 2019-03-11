package com.dao.impl;

import com.dao.IAccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class AccountDAOImpl implements IAccountDAO {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public int transOut(long outId, int money) {
        String sql = "update account set balance= balance - ? where id= ?";
        return this.jdbcTemplate.update(sql,money,outId);

    }

    @Override
    public int transIn(long inId, int money) {
        String sql = "update account set balance= balance + ? where id= ?";
        return this.jdbcTemplate.update(sql,money,inId);
    }
}
