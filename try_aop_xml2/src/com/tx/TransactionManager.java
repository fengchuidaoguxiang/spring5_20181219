package com.tx;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;

public class TransactionManager {

    public void begin(JoinPoint joinPoint){
        System.out.println("代理对象（中介）：" + joinPoint.getThis().getClass());
        System.out.println("目标对象：" + joinPoint.getTarget().getClass());
        System.out.println("被增强方法的参数：" + Arrays.toString(joinPoint.getArgs()));
        System.out.println("被增强方法的签名" + joinPoint.getSignature());
        System.out.println("当前连接点的类型：" + joinPoint.getKind());
        System.out.println("开启事务");
    }

    public void commit(JoinPoint joinPoint){
        System.out.println("提交事务");
    }

    public void rollback(JoinPoint joinPoint,Throwable ex){
        System.out.println("回滚事务，异常信息：" + ex.getMessage());
    }

    public void close(JoinPoint joinPoint){
        System.out.println("释放资源");
    }

    public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
        Object obj = null;
        try {
            System.out.println("aroundMethod---开启事务");
            obj = proceedingJoinPoint.proceed();//调用目标对象的方法
            System.out.println("aroundMethod---提交事务");
        }catch (Throwable e){
            System.out.println("aroundMethod---回滚事务，异常信息：" + e.getMessage());
        }finally {
            System.out.println("aroundMethod---释放资源");
        }
        return obj;
    }
}

