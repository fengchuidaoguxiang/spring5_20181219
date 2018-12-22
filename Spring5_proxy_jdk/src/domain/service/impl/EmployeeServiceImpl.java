package domain.service.impl;

import domain.dao.IEmployDAO;
import domain.domain.Employee;
import domain.service.IEmployeeService;
import lombok.Setter;

public class EmployeeServiceImpl implements IEmployeeService {
    @Setter
    private IEmployDAO dao;

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
