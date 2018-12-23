package dao.impl;

import dao.IEmployeeDao;
import domain.Employee;import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDAOImpl extends JdbcDaoSupport implements IEmployeeDao {
    
    @Override
    public void save(Employee employee) {
        super.getJdbcTemplate().update("insert into employee(id,name,age) values(?,?,?)",employee.getId(),employee.getName(),employee.getAge());
    }

    @Override
    public void delete(long id) {
        super.getJdbcTemplate().update("delete from employee where id=?",id);
    }

    @Override
    public void update(Employee employee) {
        super.getJdbcTemplate().update("update employee set name=?,age=? where id=?",employee.getName(),employee.getAge(),employee.getId());
    }

    @Override
    public Employee get(long id) {
         List<Employee> employees = super.getJdbcTemplate().query("select id,name,age from employee where id=?", new Object[]{id},
                 (resultSet, i)-> {
                Employee employee = new Employee();
                employee.setId(resultSet.getLong("id"));
                employee.setName(resultSet.getString("name"));
                employee.setAge(resultSet.getInt("age"));
                return employee;
            });
       return employees.size() == 1 ? employees.get(0) : null;
    }

    @Override
    public List<Employee> listAll() {
        List<Employee> employees = super.getJdbcTemplate().query("select id eid,name,age from employee", new RowMapper<Employee>() {
            @Override
            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
                Employee employee = new Employee();
                    employee.setId(resultSet.getLong("eid"));
                    employee.setName(resultSet.getString("name"));
                    employee.setAge(resultSet.getInt("age"));
                return employee;
            }
        });
        return employees;
    }
}
