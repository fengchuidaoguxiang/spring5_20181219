package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class Person {
    //用@AutoWired注解自动注入依赖
//    @Autowired(required = false)
//    @Qualifier("cat2")
//    private Cat cat1;

    //用@Resource注解自动注入依赖
//    @Resource(name="cat2")
    @Resource
    private Cat cat1;

    @Override
    public String toString() {
        return "Person{" + "cat1=" + cat1 + '}';
    }
}
