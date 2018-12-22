package dao;

import domain.Employee;

public interface IEmployeeDao {

    public void save(Employee emp);
    public void update(Employee emp);

}
