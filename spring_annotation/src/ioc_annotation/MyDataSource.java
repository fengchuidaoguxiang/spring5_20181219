package ioc_annotation;

import org.springframework.stereotype.Repository;

// XML配置： <bean id="myDataSource" class="ioc.MyDataSource"/>
//注解配置Bean:@Component组件
@Repository //如果@Component组件不写value属性值，此时bean的id是类型首字母小写：此例子默认：myDataSource
public class MyDataSource {
}
