package dao.impl;

import dao.IEmployeeDao;
import domain.Employee;

public class EmployeeDaoImpl implements IEmployeeDao {
    @Override
    public void save(Employee emp) {
        System.out.println("保存员工");
    }

    @Override
    public void update(Employee emp) {
        System.out.println("修改员工");
    }
}
