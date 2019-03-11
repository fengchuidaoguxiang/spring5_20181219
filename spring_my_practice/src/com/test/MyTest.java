package com.test;

import com.dao.IUserDao;
import com.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig
@ContextConfiguration("classpath:application-context.xml")
public class MyTest {

//    @Autowired
//    private MyController myController;
//    @Autowired
//    private ValueBean valueBean;
////    @Autowired
////    private ValueBean valueBean2;
////    @Autowired
//    private ValueBean2 valueBean3;
//
//    @Test
//    public void test1(){
//        System.out.println(myController);
//    }
//    @Test
//    public void test2(){
//        System.out.println(valueBean);
//        valueBean.dowork();
////        System.out.println(valueBean2);
//    }
//
//    @Test
//    public void test3(){
//        System.out.println(valueBean3);
//        valueBean3.test3();
//    }
//
////    @Autowired
//    private IUserDao userDao;
//
//    @Test
//    public void test4(){
//        User user = new User(21L,"Kitt23",18);
////        System.out.println(userDao.update(user));
//        System.out.println(userDao.get(99));
////          System.out.println(userDao.listAll());
//    }
    @Autowired
    @Qualifier("dao2")
    private IUserDao dao22;

    @Test
    public void test5(){
        User user = new User(25L,"Kitt24",18);
        System.out.println(dao22.save(user));

    }
    @Autowired
    A a;

    @Test
    public void test6(){
        System.out.println(a);
    }

}
