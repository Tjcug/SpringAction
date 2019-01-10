package com.hust.edu;

import com.hust.edu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class FactoryMain {
    public static void main(String[] args) {
        /**
         *  实例工厂测试代码
         */
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        People peo1 = (People) applicationContext.getBean("peo1");
        People peo2 = (People) applicationContext.getBean("peo2");
        System.out.println(peo1);
        System.out.println(peo2);
    }
}
