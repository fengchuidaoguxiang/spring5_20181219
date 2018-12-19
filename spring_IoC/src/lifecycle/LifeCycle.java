package lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycle {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("lifecycle/Main-context.xml");
        MyDataSource myDataSource = ctx.getBean("myDataSource",MyDataSource.class);
        myDataSource.doWork();
        //释放资源最佳实践:把Spring线程作为JVM的子线程：ctx.registerShutdownHook()
        ctx.registerShutdownHook();
    }
}
