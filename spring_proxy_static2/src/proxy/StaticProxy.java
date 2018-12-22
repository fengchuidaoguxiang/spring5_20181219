package proxy;

import dao.impl.EmployeeDaoImpl;
import domain.Employee;
import lombok.Setter;
import service.IEmployeeService;
import service.impl.EmployeeServiceImpl;
import transaction.TransactionManager;

public class StaticProxy implements IEmployeeService {
    //真实对象
    @Setter
    private EmployeeServiceImpl service;
    @Setter
    private TransactionManager transactionManager;

    @Override
    public void save(Employee emp) {
        transactionManager.begin();
        try{
            service.save(emp);
            transactionManager.commit();
        }catch (Exception e){
            e.printStackTrace();
            transactionManager.rollback();
        }
    }

    @Override
    public void update(Employee emp) {
        transactionManager.begin();
        try{
            service.update(emp);
            transactionManager.commit();
        }catch (Exception e){
            e.printStackTrace();
            transactionManager.rollback();
        }
    }
}
