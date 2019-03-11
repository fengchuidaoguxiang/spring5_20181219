package com.service.impl;

import com.dao.IEmployeeDAO;
import com.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl {
    @Autowired
    private IEmployeeDAO dao;

    public void save(Employee employee) {
            dao.save(employee);
            System.out.println("service层---保存操作");

    }

    public void update(Employee employee) {
            dao.update(employee);
        System.out.println("service层---修改操作");
        int a = 1/0;
    }

    public void setDao(IEmployeeDAO dao) {
        this.dao = dao;
    }
}
