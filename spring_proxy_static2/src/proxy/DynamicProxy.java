package proxy;

import lombok.Setter;
import transaction.TransactionManager;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {
    @Setter
    private Object realService;
    @Setter
    private TransactionManager transactionManager;
    @SuppressWarnings("all")
    public <T> T getProxy(){
        return (T)Proxy.newProxyInstance(realService.getClass().getClassLoader(),
                realService.getClass().getInterfaces(),
                new MyInvocationHandler());
    }

    private class MyInvocationHandler implements InvocationHandler{
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("代理开始");
            transactionManager.begin();
            try{
                method.invoke(realService,args);
                transactionManager.commit();
            }catch (Exception e){
                e.printStackTrace();
                transactionManager.rollback();
            }
            System.out.println("代理结束");
            return null;
        }
    }
}
