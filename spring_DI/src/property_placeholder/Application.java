package property_placeholder;

import com.alibaba.druid.pool.DruidDataSource;
import com.mysql.cj.protocol.Resultset;
import hello_setter.CollectionBean1;
import hello_setter.Employee1;
import hello_setter.Person1;
import lombok.Cleanup;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SpringJUnitConfig
public class Application {
    @Autowired
    private DataSource ds;

    @Test
    public void test() throws SQLException {
//        ds = new DruidDataSource();
//        ds.setDriverClassName("com.mysql.jdbc.Driver");
//        ds.setUrl("jdbc:mysql://localhost:3306/springdemo?serverTimezone=GMT%2B8");
//        ds.setUsername("root");
//        ds.setPassword("123456");
//        ds.setInitialSize(2);
        try(
        Connection conn = ds.getConnection();
        PreparedStatement prepare = conn.prepareStatement("select id,name,age from student");
        ResultSet resultSet = prepare.executeQuery();
        ) {
            while (resultSet.next()) {
                System.out.print(resultSet.getLong("id") + ",");
                System.out.print(resultSet.getString("name") + ",");
                System.out.println(resultSet.getInt("age"));
            }
        }
    }
}
