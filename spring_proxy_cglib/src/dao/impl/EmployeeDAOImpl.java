package dao.impl;

import dao.IEmployeeDAO;
import domain.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
    @Override
    public void save(Employee emp) {
        System.out.println("保存员工");
    }

    @Override
    public void update(Employee emp) {
        System.out.println("修改员工");
    }
}
