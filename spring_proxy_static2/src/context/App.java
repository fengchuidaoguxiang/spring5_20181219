package context;

import domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import proxy.DynamicProxy;
import service.IEmployeeService;

@SpringJUnitConfig
public class App {
    @Autowired
    private DynamicProxy proxyFactory;



    @Test
    public void test1(){
        IEmployeeService proxy = proxyFactory.getProxy();
        proxy.save(new Employee());

    }

    @Test
    public void test2(){
        IEmployeeService proxy = proxyFactory.getProxy();
        proxy.update(new Employee());
    }

}
