package com.hust.edu.di;

import com.hust.edu.pojo.PeopleDesk;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu.di
 * Created by MasterTj on 2019/1/10.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("di.xml");
        PeopleDesk peo = applicationContext.getBean("peodesk", PeopleDesk.class);

        System.out.println(peo);
    }
}
