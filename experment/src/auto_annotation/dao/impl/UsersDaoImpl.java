package auto_annotation.dao.impl;

import auto_annotation.dao.UsersDao;
import auto_annotation.domain.Users;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsersDaoImpl implements UsersDao {
    @Setter
    @Autowired
    private DataSource dataSource;
    @Override
    public void insert(Users users) {
        String sql = "insert into users(username,age,sex) values(?,?,?)";
        try(Connection conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
        ){
            ps.setString(1,users.getUsername());
            ps.setInt(2,users.getAge());
            ps.setString(3,users.getSex());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
