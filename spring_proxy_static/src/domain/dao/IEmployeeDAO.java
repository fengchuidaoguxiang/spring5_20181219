package domain.dao;

import domain.domain.Employee;

public interface IEmployeeDAO {
    public void save(Employee emp);
    public void update(Employee emp);
}
