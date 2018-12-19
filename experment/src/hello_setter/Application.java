package hello_setter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Application {
    @Autowired
    private Person person;
    @Test
    public void autoXml(){
        System.out.println(person);
    }
}
