package log;

import lombok.Setter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//日志增加
public class LogProxyFactory {
    @Setter
    private Object realObject;
    @Setter
    private LogUtils logUtils;

    //创建代理对象
    public <T> T getProxyObject(){
//        Enhancer enhancer = new Enhancer();
//        enhancer.setSuperclass(realObject.getClass());
//        enhancer.setCallback(new MyInvocationHandler());
//        return (T)enhancer.create();
        return (T) Enhancer.create(realObject.getClass(),new MyMethodInterceptor());
    }

    class MyMethodInterceptor implements MethodInterceptor{
        @Override
        public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
            System.out.println(proxy.getClass());
            logUtils.writeLog(method.getDeclaringClass() + ":" + method.getName());
            Object obj = method.invoke(realObject, args);//调用真实对象的方法
            return obj;
        }
    }
}
