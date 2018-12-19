package hello;

import hello.domain.Employee;
import hello.service.IEmployeeService;
import hello.proxy.MyProxy;
import jdk.nashorn.internal.objects.annotations.Setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private MyProxy myProxy;

    @Test
    public void test1(){
        //获取代理对象
        IEmployeeService proxy = myProxy.getProxyObjext();
//        System.out.println(proxy.getClass());
        proxy.save(new Employee());
    }
    @Test
    public void test2(){
        IEmployeeService proxy = myProxy.getProxyObjext();
        proxy.update(new Employee());
    }
}
