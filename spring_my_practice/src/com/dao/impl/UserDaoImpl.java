package com.dao.impl;

import com.dao.IUserDao;
import com.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository("dao1")
public class UserDaoImpl implements IUserDao {

//    @Autowired
//    private DataSource dataSource;
//    @Override
//    public int save(User user) {
//        try(Connection conn = dataSource.getConnection()){
//            System.out.println("保存操作");
//            String sql = "INSERT INTO user(id,name,age) values(?,?,?)";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setLong(1, user.getId());
//            ps.setString(2,user.getName());
//            ps.setInt(3,user.getAge());
//            return ps.executeUpdate();
//        }
//        catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setDataSource( DataSource dataSource ){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int save(User user) {
        int result = this.jdbcTemplate.update("insert into user(id,name,age) values(?,?,?)"
        ,user.getId(),user.getName(),user.getAge());
        return result;
    }

    @Override
    public int update(User user) {
        int result = this.jdbcTemplate.update("update user set name=?,age=? where id=?"
                ,user.getName(),user.getAge(),user.getId());
        return result;
    }

    @Override
    public User get(long id) {
        List<User> users = this.jdbcTemplate.query("select id,name,age from user where id=?",
                new Object[]{id},
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        User user = new User();
                        user.setId(resultSet.getLong("id"));
                        user.setName(resultSet.getString("name"));
                        user.setAge(resultSet.getInt("age"));
                        return user;
                    }
                });
        return users.size() != 0 ? users.get(0): null;
    }

    @Override
    public List<User> listAll() {
        List<User> users = this.jdbcTemplate.query("select id,name,age from user",
                new RowMapper<User>() {
                    @Override
                    public User mapRow(ResultSet resultSet, int i) throws SQLException {
                        User user = new User();
                        user.setId(resultSet.getLong("id"));
                        user.setName(resultSet.getString("name"));
                        user.setAge(resultSet.getInt("age"));
                        return user;
                    }
                });
        return users;
    }
}
