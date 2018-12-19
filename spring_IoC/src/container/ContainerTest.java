package container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class ContainerTest {
    @Autowired
    Person person;
    @Autowired
    BeanFactory beanFactory;
    @Autowired
    ApplicationContext cxt;
    @Test
    public void test1(){
        System.out.println("------------"+beanFactory);
        System.out.println("-----------------------"+cxt);
    }
}
