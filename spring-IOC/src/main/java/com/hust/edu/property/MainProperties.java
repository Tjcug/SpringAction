package com.hust.edu.property;

import com.hust.edu.pojo.PropertiesPojo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu.property
 * Created by MasterTj on 2019/1/10.
 */
public class MainProperties {
    public static void main(String[] args) {
        ApplicationContext applicationContext=null;
        applicationContext=new ClassPathXmlApplicationContext("properties.xml");
        PropertiesPojo pro = applicationContext.getBean("pro", PropertiesPojo.class);

        System.out.println(pro);
    }
}
