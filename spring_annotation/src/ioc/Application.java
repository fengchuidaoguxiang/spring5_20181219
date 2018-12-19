package ioc;

import di.Person;
import di.ValueBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.annotation.Resource;

@SpringJUnitConfig
public class Application {

    @Autowired
    @Qualifier("myDataSource")
    MyDataSource myDataSource;

    @Test
    public void test1(){
        System.out.println(myDataSource);
    }
}
