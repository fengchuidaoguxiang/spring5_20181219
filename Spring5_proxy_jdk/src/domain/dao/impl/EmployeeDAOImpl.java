package domain.dao.impl;

import domain.dao.IEmployDAO;
import domain.domain.Employee;

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
