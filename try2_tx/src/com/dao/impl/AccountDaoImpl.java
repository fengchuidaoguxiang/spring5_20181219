package com.dao.impl;

import com.dao.IAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class AccountDaoImpl implements IAccountDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int tranout(int outId, long money) {
        String sql = "update account set balance= balance - ? where id= ?";
        return this.jdbcTemplate.update(sql,money,outId);
    }

    @Override
    public int tranint(int inId, long money) {
        String sql = "update account set balance= balance + ? where id= ?";
        return this.jdbcTemplate.update(sql,money,inId);
    }
}
