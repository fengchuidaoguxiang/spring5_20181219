package lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Application {
    @Autowired
    SomeBean bean1;
    @Autowired
    SomeBean bean2;

    @Test
    public void test1(){
        System.out.println(bean1);
        System.out.println(bean2);
        bean1.doWork();
    }
}
