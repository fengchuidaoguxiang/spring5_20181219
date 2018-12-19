package hello.dao.impl;

import hello.dao.IEmployDAO;
import hello.domain.Employee;

public class EmployeeDAOImpl implements IEmployDAO {

    @Override
    public void save(Employee emp) {
        System.out.println("保存员工");
    }

    @Override
    public void update(Employee emp) {
        System.out.println("修改员工");
    }
}
