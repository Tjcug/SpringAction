package com.hust.edu;

import com.hust.edu.pointcut.ParamWorker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
public class ParamMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicatonContext.xml");
        ParamWorker worker = ac.getBean("paramWorker", ParamWorker.class);
        worker.doSomething("watch",150);
        worker.doSomething("watch");
        worker.doNoCutSomething("watch");
    }
}
