package com.hust.edu;

import com.hust.edu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/9.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        People peo = (People) applicationContext.getBean("peo");
        System.out.println(peo);
    }
}
