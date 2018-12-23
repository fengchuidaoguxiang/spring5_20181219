package log;

import java.util.Date;
//本节学习目的：熟悉拦截器原理
//在service方法调用之前，做日志记录
public class LogUtils {
    public void writeLog( String methodName  ){
        System.out.println(new Date().toLocaleString() + "调用了" + methodName + "方法");
    }
}
