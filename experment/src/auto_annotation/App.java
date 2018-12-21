package auto_annotation;

import auto_annotation.dao.UsersDao;
import auto_annotation.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
public class App {
    @Autowired
    private UsersDao dao;
    @Test
    public void test1(){
        dao.insert(new Users("Nitty",19,"man"));
    }
}
