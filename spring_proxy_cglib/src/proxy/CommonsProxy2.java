package proxy;

import lombok.Setter;
import transaction.TransactionManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//实现InvocationHandler接口方式2
public class CommonsProxy2 implements InvocationHandler{
    @Setter
    private Object target;//真实对象（对谁做增强）

    @Setter
    private TransactionManager manager;

    @SuppressWarnings("all")
    public <T> T getProxyObject(){
       return  (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), //类加载器，一般跟上真实对象的类加载器
                target.getClass().getInterfaces(),//真实对象所实现的接口（JDK动态代理要求真实对象必须有接口）
                this);//如何做事务增强的对象
    }

    //如何为真实对象的方法做增强的具体操作
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        System.out.println(proxy);//等价于System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
        Object obj = null;
        manager.begin();
        try {
            //------------------------------------------------------------------------------
            obj = method.invoke(target, args);//通过反射动态调用真实对象的方法
            //------------------------------------------------------------------------------
            manager.commit();
        }catch (Exception e){
            e.printStackTrace();
            manager.rollback();
        }
        return obj;
    }
}
