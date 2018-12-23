package service;

import domain.Employee;

public interface IEmployeeService {
    public void save(Employee employee);
    public void update(Employee employee);
}
