package springtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * SpringTest案例的测试
 */

//运行Spring的jUnit4
@RunWith(SpringJUnit4ClassRunner.class)
//上下文配置对象（寻找配置文件的）
@ContextConfiguration("classpath:springtest/SpringTestTest-context.xml")
//默认在测试类的包下找 SpringTestTest-context.xml
//@ContextConfiguration()
public class SpringTestTest_junit4 {
    //自动装配：表示自动按照类型去Spring容器中找到bean对象，并设置给该字段
    @Autowired
    private SomeBean bean;
    @Test
    public void testIoC(){
        bean.doWork();
    }
}
