package com.hust.edu;

import com.hust.edu.service.PeopleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 * 通过Java代码装配Bean
 */
public class JavaMain {
    public static void main(String[] args) {
        //加载java配置类获取Spring应用上下文
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        PeopleService peopleService = ac.getBean("peopleService", PeopleService.class);
        System.out.println(peopleService.findAllPeople());
    }
}
