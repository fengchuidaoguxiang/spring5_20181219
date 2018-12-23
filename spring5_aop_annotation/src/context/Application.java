package context;

import domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import service.impl.EmployeeServiceImpl;

@SpringJUnitConfig
public class Application {

    @Autowired
    private EmployeeServiceImpl service;

    @Test
    public void testSave(){
        System.out.println(service.getClass());
        service.save(new Employee());
    }

    @Test
    public void testUpdate(){
        System.out.println(service.getClass());
        service.update(new Employee());
    }
}
