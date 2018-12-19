package scope;

import createbean._01_constructor.Cat1;
import createbean._02_static_factory.Cat2;
import createbean._02_static_factory.Cat2Factory;
import createbean._03_instance_factory.Cat3;
import createbean._03_instance_factory.Cat3Factory;
import createbean._04_factory_bean.Cat4;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private Dog dog1;

    @Autowired
    private Dog dog2;

    @Autowired
    private Dog dog3;

    @Test
    public void test(){
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
