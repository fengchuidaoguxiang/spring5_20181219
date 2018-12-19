package register.dao.impl;

import lombok.Cleanup;
import lombok.Setter;
import lombok.SneakyThrows;
import register.dao.IUserDAO;
import register.domain.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl implements IUserDAO {
    @Setter
    private DataSource dataSource;

    @SneakyThrows
    public void save(User u) {
        System.out.println("保存操作");
        String sql = "insert into user(id,name,age) values(?,?,?)";
        try(Connection conn = dataSource.getConnection();
            PreparedStatement preparedStat = conn.prepareStatement(sql);
        ){
            preparedStat.setLong(1,u.getId());
            preparedStat.setString(2,u.getName());
            preparedStat.setInt(3,u.getAge());
            preparedStat.executeUpdate();
        }
    }
}
