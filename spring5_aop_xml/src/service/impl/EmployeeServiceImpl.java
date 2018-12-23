package service.impl;

import dao.IEmployeeDao;
import domain.Employee;
import lombok.Setter;
import service.IEmployeeService;

public class EmployeeServiceImpl implements IEmployeeService {
    @Setter
    private IEmployeeDao dao;

    @Override
    public void save(Employee employee) {
        dao.save(employee);
        System.out.println("保存成功");
    }

    @Override
    public void update(Employee employee) {
        dao.update(employee);
        throw new RuntimeException("故意抛出异常");
    }
}
