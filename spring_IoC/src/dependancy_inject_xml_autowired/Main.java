package dependancy_inject_xml_autowired;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Main {

    @Autowired
    private  Person per;
    @Test
    public void testOne(){
        System.out.println(per);
    }

}
