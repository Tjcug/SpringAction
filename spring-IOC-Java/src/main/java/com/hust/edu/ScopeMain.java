package com.hust.edu;

import com.hust.edu.scope.FootBall;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 * 通过隐式的Bean发现机制和自动装配
 */
public class ScopeMain {
    public static void main(String[] args) {
        //加载java配置类获取Spring应用上下文
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        FootBall footBall1 = ac.getBean("footBall", FootBall.class);
        FootBall footBall2 = ac.getBean("footBall", FootBall.class);
        System.out.println(footBall1.hashCode());
        System.out.println(footBall2.hashCode());
        System.out.println(footBall1==footBall2);
    }
}
