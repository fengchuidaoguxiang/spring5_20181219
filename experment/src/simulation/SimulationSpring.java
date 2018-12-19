package simulation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SimulationSpring {
    /**
     * 模拟Spring容器
     */
    @Test
    public void testMock() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException, IntrospectionException {
        Dog dog = null;
        /////////////////////////////
        //使用反射创建对象
        Class clazz = Class.forName("simulation.Dog");
        Constructor cons = clazz.getDeclaredConstructor();
        cons.setAccessible(true);
        dog = (Dog)cons.newInstance();
        //使用内省机制设置对象的属性值
        BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        for(PropertyDescriptor temp : propertyDescriptors){
            if("name".equals(temp.getName())){
                Method write = temp.getWriteMethod();
                write.invoke(dog,"Tom");
            }else if("age".equals(temp.getName())){
                Method write = temp.getWriteMethod();
                write.invoke(dog,12);
            }
        }
        ////////////////////////////
        dog.say();
    }
}
