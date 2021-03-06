package context;

import jdk.nashorn.internal.objects.annotations.Getter;
import service.impl.EmployeeServiceImpl;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DynamicProxyClassGenerator {

    public static void main(String[] args) {
        generateClassFile(EmployeeServiceImpl.class,"EmployeeServiceProxy");
    }

    //生成代理类的字节码文件
    public static void generateClassFile(Class targetClass,String proxyName){
        //根据类信息和提供的代理类名称，生成字节码
        byte[] classFile = ProxyGenerator.generateProxyClass(proxyName,targetClass.getInterfaces());
        String path = targetClass.getResource(".").getPath();
        System.out.println(path);
        //保留到硬盘上
        try (FileOutputStream out = new FileOutputStream(path + proxyName + ".class")){
            out.write(classFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
