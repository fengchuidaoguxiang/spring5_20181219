package hello;

import hello.domain.Employee;
import hello.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private IEmployeeService service;

    @Test
    public void test1(){
        System.out.println(service.getClass()); //查看对象的真实类型
        service.save(new Employee());

    }

    @Test
    public void test2(){
        service.update(new Employee());

    }
}
