package com.tx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserManager {

    @Pointcut(value = "execution(* com.service.impl.*ServiceImpl.add(..))")
    public void myPointcut(){

    }

//    @Before("myPointcut()")
//    public void begin(JoinPoint joinPoint){
//        System.out.println("装饰器----begin");
//    }
//    @AfterReturning("myPointcut()")
//    public void commit(){
//        System.out.println("装饰器----commit");
//    }
//
//
//    @AfterThrowing(value="myPointcut()",throwing = "ex")
//    public void mythrow(JoinPoint joinPoint, Throwable ex){
//        System.out.println(joinPoint.getTarget());
//        System.out.println("装饰器----mythrow:信息是" + ex.getMessage());
//    }
//
//    @After("myPointcut()")
//    public void finish(){
//        System.out.println("装饰器----finish");
//    }

    @Around("myPointcut()")
    public void myaround(ProceedingJoinPoint proceedingJoinPoint){
        try{
            System.out.println("装饰器2----begin");
            proceedingJoinPoint.proceed();
            System.out.println("装饰器2----commit");
        } catch (Throwable throwable) {
            System.out.println("装饰器2----rollback");
            throwable.printStackTrace();
        } finally {
            System.out.println("装饰器2----finish");
        }
    }
}
