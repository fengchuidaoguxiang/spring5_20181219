package context;

import domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import proxy.CommonsProxy;
import service.impl.EmployeeServiceImpl;

@SpringJUnitConfig
public class App {
    @Autowired
    CommonsProxy proxyFactory;

    //CGLIB代理对象
    @Test
    public void test1(){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E:\\C++程序");
        EmployeeServiceImpl proxy = proxyFactory.getProxyObject();
        proxy.save(new Employee());
        System.out.println(proxy.getClass());
    }

    @Test
    public void test2(){
        EmployeeServiceImpl proxy = proxyFactory.getProxyObject();
        proxy.update(new Employee());
    }
}
