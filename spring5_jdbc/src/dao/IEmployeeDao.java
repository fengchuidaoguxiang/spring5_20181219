package dao;

import domain.Employee;

import java.util.List;

public interface IEmployeeDao {
    public void save(Employee employee);
    public void delete(long id);
    public void update(Employee employee);
    public Employee get(long id);
    public List<Employee> listAll();
}
