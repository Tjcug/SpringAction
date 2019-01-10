package com.hust.edu.pointcut;

/**
 * locate com.hust.edu.pointcut
 * Created by MasterTj on 2019/1/10.
 */
public class ParamWorker {
    public void doSomething(String name,int time) throws Exception{
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
