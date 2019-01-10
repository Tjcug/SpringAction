package com.hust.edu.property;

import com.hust.edu.pojo.PeopleList;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu.property
 * Created by MasterTj on 2019/1/10.
 */
public class MainList {
    public static void main(String[] args) {
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("properties.xml");
        PeopleList peo = applicationContext.getBean("peoList", PeopleList.class);

        System.out.println(peo);
    }
}
