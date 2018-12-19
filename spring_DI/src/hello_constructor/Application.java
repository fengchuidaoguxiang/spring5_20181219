package hello_constructor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Application {
    @Autowired
    private Employe2 employee2;
    @Autowired
    private Person2 person2;
    @Autowired
    private CollectionBean2 collectionBean2;
//    @Autowired
    private Cat2 cat2;

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("application-context.xml");
        employee2 = ac.getBean("employee2", Employe2.class);
        System.out.println(employee2);
    }
    @Test
    public void test2(){
        System.out.println(employee2);
    }
    @Test
    public void test3(){
        System.out.println(person2);
    }
    @Test
    public void test4(){
        System.out.println(collectionBean2);
    }

    @Test
    public void test5(){
        System.out.println(cat2);
    }
}
