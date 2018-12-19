package container;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    //使用BeanFactory
    /**
     结论：BeanFactory有“延迟初始化”（懒：lazy）的特点，在创建Spring容器的时候，不会立马去创建容器中的Bean对象，
           而是要等到从容器中去获取对象的时候，Spring容器才会去创建对象。
     * ----------------------------
     * 构建Person......
     * @throws Exception
     */
    @Test
    void testBeanFactory() throws Exception{
        Resource resource = new ClassPathResource("container/ContainerTest-context.xml");
        BeanFactory beanFact = new XmlBeanFactory(resource);
        System.out.println("----------------------------");
        //目的是得到一个Person类的实例
//        Person person1 = beanFact.getBean("person",Person.class);
    }

    //使用ApplicationContext
    /**
     结论：在创建Spring容器的时候，就会立马把容器中管理的Bean初始化，而不是等到要获取Bean的时候才初始化
     * 构建Person......
     * -----------------------------
     * @throws Exception
     */
    @Test
    void testApplicationContext() throws  Exception{
        ApplicationContext ctx = new ClassPathXmlApplicationContext("container/ContainerTest-context.xml");
        System.out.println("-----------------------------");
//        Person person2 = ctx.getBean("person",Person.class);
    }
}
