package register;

import di.Person;
import di.ValueBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

@SpringJUnitConfig
public class Application {
//    @Autowired
    @Resource
    Person person1;

    @Resource
    private ValueBean bean;

    @Test
    public void test1(){
        System.out.println(person1);
    }

    @Test
    public void test2(){
        System.out.println(bean);
    }
}
