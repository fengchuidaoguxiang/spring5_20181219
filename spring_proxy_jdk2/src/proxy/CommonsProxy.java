package proxy;

import lombok.Setter;
import service.IEmployeeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//实现InvocationHandler接口方式1
public class CommonsProxy  {
    @Setter
    private Object target;//真实对象（对谁做增强）

    @SuppressWarnings("all")//忽略所以警告
    public <T> T getProxyObject(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), //类加载器，一般跟上真实对象的类加载器
                target.getClass().getInterfaces(),//真实对象所实现的接口（JDK动态代理要求真实对象必须有接口）
                new XX());//如何做事务增强的对象
    }

    class XX implements InvocationHandler{

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
        }
    }
}
