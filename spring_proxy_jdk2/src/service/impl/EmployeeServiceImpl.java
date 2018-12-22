package service.impl;

import dao.IEmployeeDAO;
import domain.Employee;
import lombok.Setter;
import service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
    @Setter
    private IEmployeeDAO dao;
    @Override
    public void save(Employee emp) {
        dao.save(emp);
        System.out.println("保存成功");
    }

    @Override
    public void update(Employee emp) {
        dao.update(emp);
        throw new RuntimeException("故意抛出异常");
    }
}
