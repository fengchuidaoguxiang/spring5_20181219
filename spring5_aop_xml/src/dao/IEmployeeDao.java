package dao;

import domain.Employee;

public interface IEmployeeDao {
    public void save(Employee employee);
    public void update(Employee employee);
}
