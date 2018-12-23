package proxy;

import lombok.Setter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import transaction.TransactionManager;

import java.lang.reflect.Method;

//实现InvocationHandler接口方式1
public class CommonsProxy  {
    @Setter
    private Object target;//真实对象（对谁做增强）

    @Setter
    private TransactionManager manager;

    @SuppressWarnings("all")//忽略所以警告
    public <T> T getProxyObject(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());//继承真实对象，去做增强
        enhancer.setCallback(new XX());//设置增强的对象
        return (T) enhancer.create();//创建代理对象
    }

    class XX implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            //        System.out.println(proxy);//等价于System.out.println(proxy.toString());会出现堆栈异常
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
}
