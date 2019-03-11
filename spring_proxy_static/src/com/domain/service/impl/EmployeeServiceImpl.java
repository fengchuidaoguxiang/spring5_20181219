package com.domain.service.impl;

import com.domain.service.IEmployeeService;
import domain.dao.IEmployeeDAO;
import domain.domain.Employee;
import domain.service.IEmployeeService;
import lombok.Setter;

@Setter
public class EmployeeServiceImpl implements IEmployeeService {
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
