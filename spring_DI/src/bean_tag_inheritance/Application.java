package bean_tag_inheritance;

import hello_constructor.Cat2;
import hello_constructor.CollectionBean2;
import hello_constructor.Employe2;
import hello_constructor.Person2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Application {
    @Autowired
    SomeBean1 someBean1;

    @Autowired
    SomeBean2 someBean2;
    @Test
    public void test(){
        System.out.println(someBean1);
        System.out.println(someBean2);
    }

}
