package context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;


//当前项目的配置类，好比是application-context.xml
@Configuration//标志当前类为一个配置类
@Import(DataSourceConfig.class) //引入其它的java配置类
@ComponentScan("context,domain,dao,service")//开启IoC注解扫描器
@EnableTransactionManagement//开启事务注解扫描器
public class AppConfig {

    //创建n个Bean
    //配置事务管理Bean
    @Bean
    public DataSourceTransactionManager txManager(DataSource dataSource){
        return new DataSourceTransactionManager(dataSource);
    }
}
