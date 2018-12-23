package context;

import domain.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import proxy.CommonsProxy2;
import service.IEmployeeService;

@SpringJUnitConfig
public class App {

    @Autowired
    private CommonsProxy2 proxyFactory;

    @Test
    public void test1(){
        //获取代理对象
         IEmployeeService myProxy = proxyFactory.getProxyObject();
//        System.out.println(myProxy);
//        System.out.println(myProxy.getClass());
        myProxy.save(new Employee());
    }

    @Test
    public void test2(){
        IEmployeeService myProxy2 = proxyFactory.getProxyObject();
        myProxy2.update(new Employee());
    }

    @Test
    public void test3(){
        IEmployeeService myProxye = proxyFactory.getProxyObject();
        myProxye.delete(1L);
    }

    @Test
    public void test4(){
        IEmployeeService service = proxyFactory.getProxyObject();
        service.listAll();
    }


}
