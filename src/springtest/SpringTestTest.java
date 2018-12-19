package springtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * SpringTest案例的测试
 */

//运行Spring的jUnit5方式
@SpringJUnitConfig
public class SpringTestTest {
    @Autowired
    private SomeBean someBean;
    @Test
    public void testName() throws  Exception{
        someBean.doWork();
    }

}
