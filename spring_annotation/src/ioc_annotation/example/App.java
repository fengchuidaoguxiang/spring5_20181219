package ioc_annotation.example;

import ioc_annotation.example.Controller.User2Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private User2Controller controller2;

    @Test
    public void test1(){
        controller2.execute();
    }
}
