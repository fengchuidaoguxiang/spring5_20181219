package service.impl;

import dao.IEmployeeDAO;
import domain.Employee;
import lombok.Setter;

public class EmployeeServiceImpl  {
    @Setter
    private IEmployeeDAO dao;

    public void save(Employee emp) {
        dao.save(emp);
        System.out.println("保存成功");
    }


    public void update(Employee emp) {
        dao.update(emp);
        throw new RuntimeException("故意抛出异常");
    }
}
