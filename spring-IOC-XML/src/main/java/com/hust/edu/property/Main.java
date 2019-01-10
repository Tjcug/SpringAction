package com.hust.edu.property;

import com.hust.edu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu.property
 * Created by MasterTj on 2019/1/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("properties.xml");
        People peo = applicationContext.getBean("peo", People.class);

        System.out.println(peo);
    }
}
