package com.hust.edu.pointcut;

/**
 * locate com.hust.edu
 * Created by MasterTj on 2019/1/10.
 */
public class Worker {
    public void doSomething(String name){

        switch (name){
            case "watch":
                System.out.println("----------watch TV---------");
                break;
            default:
                break;
        }
    }

    public void doNoCutSomething(String name){
        int i=1/0;
        switch (name){
            case "watch":
                System.out.println("----------watch TV---------");
                break;
            default:
                break;
        }
    }
}
