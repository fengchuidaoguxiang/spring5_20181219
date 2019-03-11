package com.domain.proxy;

import domain.domain.Employee;
import domain.service.IEmployeeService;
import domain.tx.TransactionManager;
import lombok.Setter;

//静态代理类
@Setter
public class EmployeeServiceProxy implements IEmployeeService {

    //真实对象（委托对象）
    private IEmployeeService target;
    //事务管理器
    private TransactionManager txManager;

    @Override
    public void save(Employee emp) {
        txManager.begin();
        try {
            target.save(emp);
            txManager.commit();
        }catch (Exception e){
            e.printStackTrace();
            txManager.rollback();
        }

    }

    @Override
    public void update(Employee emp) {
        txManager.begin();
        try{
            target.update(emp);
            txManager.commit();
        }catch (Exception e){
            e.printStackTrace();
            txManager.rollback();
        }
    }
}
