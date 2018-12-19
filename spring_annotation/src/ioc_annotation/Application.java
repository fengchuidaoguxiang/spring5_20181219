package ioc_annotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

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
