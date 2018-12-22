package context;

import controller.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Application {
    @Autowired
    Controller controller;

    @Value("${db.url}")
    String driverName;

    @Value("3")
    int age;

    @Autowired
    SomeBean someBean;

    @Test
    public void test1(){
        controller.execute();
    }

    @Test
    public void test2(){
        controller.execute2();
    }

    @Test
    public void test3(){
        System.out.println(driverName);
    }

    @Test
    public void test4(){
        System.out.println(age);
    }

    @Test void test5(){
        someBean.doWork();
    }
}
