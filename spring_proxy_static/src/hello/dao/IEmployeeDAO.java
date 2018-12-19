package hello.dao;

import hello.domain.Employee;

public interface IEmployeeDAO {
    public void save(Employee emp);
    public void update(Employee emp);
}
