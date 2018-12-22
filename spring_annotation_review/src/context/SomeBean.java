package context;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("someBean1")
@Scope("singleton")
public class SomeBean {
    public SomeBean(){
        System.out.println("构造对象");
    }
    @PostConstruct
    public void afterConstruct(){
        System.out.println("构造对象之后，立即执行的方法");
    }
    @PreDestroy
    public void beforeDestory(){
        System.out.println("销毁对象之前，需要执行的方法");
    }
    public void doWork(){
        System.out.println("工作方法。。。");
    }
}
