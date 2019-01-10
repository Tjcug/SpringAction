package com.hust.edu.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * locate com.hust.edu.autowired
 * Created by MasterTj on 2019/1/10.
 */
public class AutoMain {
    public static void main(String[] args) {
        //加载java配置类获取Spring应用上下文
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        PeopleAutowired people = ac.getBean("peopleAutowired", PeopleAutowired.class);
        System.out.println(people);
    }
}
