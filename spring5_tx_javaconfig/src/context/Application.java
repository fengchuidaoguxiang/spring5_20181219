package context;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import service.IAccountService;

@SpringJUnitConfig(classes=AppConfig.class)
public class Application {
    @Autowired
    IAccountService service;

    @Test
    public void testTrans(){
        service.trans(10086L, 10010L, 1000);
    }


}
