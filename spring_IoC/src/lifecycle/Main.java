package lifecycle;

import mypractice.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class Main {
    @Autowired
    private MyDataSource data;

    @Test
    public void testOne(){
        MyDataSource myDataSource = new MyDataSource();
        myDataSource.open();
        myDataSource.doWork();
        myDataSource.close();
    }

    @Test
    public void testTwo(){
        data.doWork();
    }
}
