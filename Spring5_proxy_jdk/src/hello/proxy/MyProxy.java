package hello.proxy;

import hello.tx.TransactionManager;
import lombok.Setter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@SuppressWarnings("all")
//事务的增强操作
public class MyProxy implements InvocationHandler{
    //真实对象（对谁做增强）
    @Setter
    private Object target;
    @Setter
    private TransactionManager transactionManager;

    //创建一个代理对象
    public <T> T getProxyObjext(){
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), //类加载器，一般跟真实对象的类加载器
                target.getClass().getInterfaces(),//真实对象所实现的接口（JDK动态代理要求真实对象必须有接口）
                this);//如何做事务增强的对象

    }

    //如何为真实对象的方法做增强的具体操作
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        transactionManager.begin();
        try {
            Object obj = method.invoke(target, args);//调用真实对象的方法
            transactionManager.commit();
            return obj;
        }catch (Exception e){
            e.printStackTrace();
            transactionManager.rollback();
        }
        return null;
    }

//    class XX implements InvocationHandler{
//
//        @Override
//        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//            return null;
//        }
//    }

}
