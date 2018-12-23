package service;

import domain.Employee;

import java.util.List;

public interface IEmployeeService {
    public void save(Employee emp);
    public void update(Employee emp);
    public void delete(Long id);
    public List<Employee> listAll();
}
