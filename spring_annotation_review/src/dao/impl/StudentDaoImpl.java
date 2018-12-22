package dao.impl;

import dao.IStudentDao;
import domain.Student;
import lombok.Setter;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository("dao1")
@Scope("singleton")
public class StudentDaoImpl implements IStudentDao {
    @Autowired
    @Qualifier("mydatasource1")
    @Setter
    private DataSource dataSource;

    @Override
    public void save(Student student) {
        String sql = "insert into student(id,name,age) values(?,?,?)";
        QueryRunner queryRunner = new QueryRunner(dataSource);
        try {
             int result= queryRunner.update(sql,student.getId(),student.getName(),student.getAge());
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Student query(long id) {
        String sql = "select id,name,age from student where id=?";
        QueryRunner queryRunner = new QueryRunner(dataSource);
        Student stu = null;
        try {
            stu = queryRunner.query(sql,new MyResultSetHandler(),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu;
    }
    class MyResultSetHandler implements ResultSetHandler<Student> {

        @Override
        public Student handle(ResultSet resultSet) throws SQLException {
            Student student = new Student();
            while (resultSet.next()){
                student.setId(resultSet.getLong(1));
                student.setName(resultSet.getString(2));
                student.setAge(resultSet.getInt(3));
            }
            return student;
        }
    }
}
