package config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;

@SpringJUnitConfig
@ContextConfiguration(classes = MyConfig.class)
public class MyTest3 {

    @Autowired
    DataSource dataSource;
    @Test
    public void test1(){
        System.out.println(dataSource.getClass());
    }


}
