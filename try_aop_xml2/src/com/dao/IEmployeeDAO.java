package com.dao;

import com.domain.Employee;

public interface IEmployeeDAO {
    public void save(Employee employee);
    public void update(Employee employee);
}
