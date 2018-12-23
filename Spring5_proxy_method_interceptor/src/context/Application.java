package context;

import domain.Employee;
import log.LogProxyFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import service.impl.EmployeeServiceImpl;

@SpringJUnitConfig
public class Application {
    @Autowired
    private LogProxyFactory logProxyFactory;

    @Test
    public void test1(){
        EmployeeServiceImpl employeeService = logProxyFactory.getProxyObject();
        employeeService.save(new Employee());
    }

    @Test
    public void test2(){
        EmployeeServiceImpl employeeService = logProxyFactory.getProxyObject();
        employeeService.update(new Employee());
    }
}
