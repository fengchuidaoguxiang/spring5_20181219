package ioc_annotation.example.Dao.impl;

import com.alibaba.druid.pool.DruidDataSource;
import ioc_annotation.example.Dao.IUser2Dao;
import ioc_annotation.example.Domain.User2;
import lombok.Setter;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
@Repository
public class User2DaoImpl implements IUser2Dao {
    @Autowired
    private DruidDataSource dataSource;

    @SneakyThrows
    public void insert(User2 user2) {
        System.out.println("DAO层插入");
        String sql = "insert into user2(myid,myname,age) value(?,?,?)";
        try(Connection conn = dataSource.getConnection();
            PreparedStatement prop = conn.prepareStatement(sql);
        ){
            prop.setLong(1,user2.getMyId());
            prop.setString(2,user2.getMyName());
            prop.setInt(3,user2.getAge());
            prop.executeUpdate();
        }
    }
}
