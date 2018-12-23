package transaction;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect//配置一个切面
public class TransactionManager {

    //等价于XML:<aop:pointcut id="transactionManagerPoint1" expression="execution(* service.*Service.*(..))"/>
    @Pointcut("execution(* service..*.*(..))")
    public void tranactionManagerPoint2(){

    }
//    @Before("tranactionManagerPoint2()")
//    public void begin( JoinPoint jp){
//
//        System.out.println("开启事务");
//    }
//    @AfterReturning("tranactionManagerPoint2()")
//    public void commit(JoinPoint jp){
//        System.out.println("提交事务");
//    }
//    @AfterThrowing(value ="tranactionManagerPoint2()",throwing = "ex")
//    public void rollback(JoinPoint jp ,Throwable ex){
//        System.out.println("回滚事务,异常信息：" + ex.getMessage());
//    }
//    @After("tranactionManagerPoint2()")
//    public void close(JoinPoint jp){
//        System.out.println("释放资源");
//    }

    @Around("tranactionManagerPoint2()")
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
