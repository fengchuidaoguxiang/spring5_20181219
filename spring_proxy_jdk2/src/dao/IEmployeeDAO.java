package dao;

import domain.Employee;

public interface IEmployeeDAO {
    public void save(Employee emp);
    public void update(Employee emp);
}
