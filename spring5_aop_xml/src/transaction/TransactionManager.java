package transaction;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionManager {
    public void begin( JoinPoint jp){
//        System.out.println("代理对象：" + jp.getThis().getClass());
//        System.out.println("真实对象:" + jp.getTarget().getClass());
//        System.out.println("被增强方法的参数:" + Arrays.toString(jp.getArgs()));
//        System.out.println("连接点方法的签名:" + jp.getSignature());
//        System.out.println("当前连接点的类型:" + jp.getKind());
        System.out.println("开启事务");
    }

    public void commit(JoinPoint jp){
        System.out.println("提交事务");
    }

    public void rollback(JoinPoint jp ,Throwable ex){
        System.out.println("回滚事务,异常信息：" + ex.getMessage());
    }

    public void close(JoinPoint jp){
        System.out.println("释放资源");
    }

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
        Object obj = null;
        System.out.println("开启事务");
        try{
            obj = proceedingJoinPoint.proceed();//调用真实对象的方法
            System.out.println("提交事务");
        }catch (Throwable e){
            System.out.println("回滚事务,异常信息：" + e);
        }finally {
            System.out.println("释放资源");
        }
        return  obj;
    }
}
