package com.dao.impl;

import com.dao.IEmployeeDAO;
import com.domain.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

    @Override
    public void save(Employee employee) {
        System.out.println("DAO层---保存操作");
    }

    @Override
    public void update(Employee employee) {
        System.out.println("DAO层---修改操作");
    }
}
