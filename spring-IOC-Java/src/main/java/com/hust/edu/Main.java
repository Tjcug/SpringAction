package com.hust.edu;

import com.hust.edu.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 * 通过隐式的Bean发现机制和自动装配
 */
public class Main {
    public static void main(String[] args) {
        //加载java配置类获取Spring应用上下文
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        People people = ac.getBean("people", People.class);
        System.out.println(people);
    }
}
