package createbean._04_factory_bean;

import org.springframework.beans.factory.FactoryBean;

public class Cat4Factory implements FactoryBean<Cat4> {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    //动态工厂方法
    @Override
    public Cat4 getObject() throws Exception {
        System.out.println("username:" + username);
        Cat4 c4 = new Cat4();
        return c4;
    }

    @Override
    public Class<?> getObjectType() {
        return Cat4.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
