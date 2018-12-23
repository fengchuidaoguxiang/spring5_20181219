package service.impl;

import dao.IEmployeeDao;
import domain.Employee;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//IoC注解
//public class EmployeeServiceImpl implements IEmployeeService {
public class EmployeeServiceImpl {
    @Autowired//DI注解
    @Setter
    private IEmployeeDao dao;


    public void save(Employee employee) {
        dao.save(employee);
        System.out.println("保存成功");
    }

    public void update(Employee employee) {
        dao.update(employee);
        throw new RuntimeException("故意抛出异常");
    }
}
