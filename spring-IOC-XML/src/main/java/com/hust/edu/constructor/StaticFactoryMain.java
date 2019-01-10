package com.hust.edu.constructor;

import com.hust.edu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
public class StaticFactoryMain {
    public static void main(String[] args) {
        /**
         *  静态工厂测试代码
         */
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("constructor.xml");
        People peo3 = applicationContext.getBean("peo3", People.class);
        People peo4 = applicationContext.getBean("peo4", People.class);
        System.out.println(peo3);
        System.out.println(peo4);
    }
}
