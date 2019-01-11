package com.hust.edu.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
@Component
public class Worker {
    @Pointcut(value = "execution(* com.hust.edu.pointcut.Worker.doSomething(String)) && args(name)")
    public void doSomething(String name) throws Exception{
        //抓取异常通知
        //int i=5/0;
        switch (name){
            case "watch":
                System.out.println("----------watch TV---------");
                break;
            default:
                break;
        }
    }

    public void doNoCutSomething(String name) throws Exception{
        switch (name){
            case "watch":
                System.out.println("----------watch TV---------");
                break;
            default:
                break;
        }
    }
}
