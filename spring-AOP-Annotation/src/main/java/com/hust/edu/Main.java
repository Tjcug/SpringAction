package com.hust.edu;

import com.hust.edu.pointcut.Worker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicatonContext.xml");
        Worker worker = ac.getBean("worker", Worker.class);
        worker.doSomething("watch");
        worker.doNoCutSomething("watch");
    }
}
