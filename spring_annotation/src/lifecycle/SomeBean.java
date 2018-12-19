package lifecycle;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("someBean1")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SomeBean {
    public SomeBean() {
        System.out.println("构建SomeBean对象");
    }

    @PostConstruct
    public void open(){
        System.out.println("初始化方法");
    }
    @PreDestroy
    public void close(){
        System.out.println("销毁前扫尾方法");
    }

    public void doWork(){
        System.out.println("工作");
    }
}
