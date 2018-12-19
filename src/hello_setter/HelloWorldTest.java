package hello_setter;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;

public class HelloWorldTest {
    /**
     * 传统方式（正控）：调用者手动来创建对象，和创建该对象所依赖的对象，并组装依赖关系
     * @throws Exception
     */
     @Test
    void testOld() throws Exception{
         //人类手动创建对象
//         HelloWorld world = new HelloWorld();
//        //给当前对象设置相关的依赖属性
//         world.setUsername("Tom");
//         world.sayHello();
     }

    /**
     * 使用Spring框架（反控）：
     * @throws Exception
     */
    @Test
    void testIoC() throws Exception{
        HelloWorld world = null;
        //----------------------------
        //1.从classpath路径去寻找配置文件
        // 根据配置文件路径，创建资源对象
        Resource resource = new ClassPathResource("applicationContext.xml");
        //2.根据资源对象，创建Spring的IoC容器对象
        BeanFactory factory = new XmlBeanFactory(resource);
        //3.从Spring的IoC容器中获取指定名称（helloWorld）的对象
//        签名一：Object getBean(String beanName); //根据bean对象在容器中的id名称来获取
//        world = (HelloWorld) factory.getBean("helloWorld");
        //签名二：<T> T getBean(Class<T> requiredType)  //按照指定的类型去寻找bean对象
//        world =  factory.getBean(HelloWorld.class);
        //签名三（推荐）：<T> T getBean(String name, Class<T> requiredType) //根据【IoC容器中的id名称】和【对象类型】去寻找bean对象
          world = factory.getBean("a",HelloWorld.class);
        //----------------------------
        world.sayHello();
     }

     //模拟springIoC容器
    @Test
    public void testIoCMock() throws Exception {
        String className = "hello.HelloWorld";
        HelloWorld world = null;
        //------------------------------
        Class clazz = Class.forName(className);
        //暴力破解私有构造器
        Constructor con = clazz.getDeclaredConstructor();
        //设置构造器的可访问性
        con.setAccessible(true);
        Object obj = con.newInstance();
        //使用内省机制设置属性值
         BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor temp:propertyDescriptors){
            if("username".equals(temp.getName())){
                //调用username的setter方法
                temp.getWriteMethod().invoke(obj,"Lucy");
            }else if("age".equals(temp.getName())){
                //调用username的setter方法
                temp.getWriteMethod().invoke(obj,19);
            }
        }

        world = (HelloWorld) obj;
        //------------------------------
        world.sayHello();
    }
}
