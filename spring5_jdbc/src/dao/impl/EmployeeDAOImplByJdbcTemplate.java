package dao.impl;

import dao.IEmployeeDao;
import domain.Employee;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;

public class EmployeeDAOImplByJdbcTemplate implements IEmployeeDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    //属性dataSource
    public void setDataSource(DataSource dataSource){
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public void save(Employee employee) {
//        jdbcTemplate.update("insert into employee(id,name,age) values(?,?,?)",employee.getId(),employee.getName(),employee.getAge());

        namedParameterJdbcTemplate.update("insert into employee(id,name,age) values(:eid,:ename,:eage)",
                new HashMap(){
                    {
                        this.put("eid",employee.getId());
                        this.put("ename",employee.getName());
                        this.put("eage",employee.getAge());
                    }
                });
    }

    @Override
    public void delete(long id) {
//        jdbcTemplate.update("delete from employee where id=?",id);
    }

    @Override
    public void update(Employee employee) {
//        jdbcTemplate.update("update employee set name=?,age=? where id=?",employee.getName(),employee.getAge(),employee.getId());
    }

    @Override
    public Employee get(long id) {
//         List<Employee> employees = jdbcTemplate.query("select id,name,age from employee where id=?", new Object[]{id},
//                 (resultSet, i)-> {
//                Employee employee = new Employee();
//                employee.setId(resultSet.getLong("id"));
//                employee.setName(resultSet.getString("name"));
//                employee.setAge(resultSet.getInt("age"));
//                return employee;
//            });
//       return employees.size() == 1 ? employees.get(0) : null;
      return  null;
    }

    @Override
    public List<Employee> listAll() {
//        List<Employee> employees = jdbcTemplate.query("select id eid,name,age from employee", new RowMapper<Employee>() {
//            @Override
//            public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
//                Employee employee = new Employee();
//                    employee.setId(resultSet.getLong("eid"));
//                    employee.setName(resultSet.getString("name"));
//                    employee.setAge(resultSet.getInt("age"));
//                return employee;
//            }
//        });
//        return employees;
        return null;
    }
}
