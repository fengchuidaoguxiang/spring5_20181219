package register;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import register.action.UserController;
import register.dao.IUserDAO;
import register.domain.User;
import sun.rmi.server.UnicastServerRef;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringJUnitConfig
public class Application {
  @Autowired
  private UserController controller;
  @Autowired
  private IUserDAO userDAO;

  @Test
   public void test1(){
      controller.execute();
  }
  @Test
    public void test2(){
      userDAO.save(new User(1111,"Tom",19));
  }
}
