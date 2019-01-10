package com.hust.edu;

import com.hust.edu.prop.Context;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
public class PropMain {
    public static void main(String[] args) {
        //加载java配置类获取Spring应用上下文
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        Context context = ac.getBean("context", Context.class);
        System.out.println(context);
    }
}
