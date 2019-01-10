package com.hust.edu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.aop.ThrowsAdvice;

/**
 * locate com.hust.edu.advice
 * Created by MasterTj on 2019/1/10.
 * 异常通知 只有当切点报异常后，才能触发异常通知
 */
public class MyParamAdvice implements ThrowsAdvice{

    public void myExeception(Exception e){
        System.out.println("---------执行异常通知--------");
        System.out.println(e.getMessage());
    }

    public void beforeCall(String name,int time){
        System.out.println("name: "+name+" time: "+time);
        System.out.println("---------执行前置--------");
    }


    public void beforeCal2(String name){
        System.out.println("name: "+name);
        System.out.println("---------执行前置--------");
    }

    public void afterCall(){
        System.out.println("---------执行后置--------");
    }

    public void afterCallReturning(){
        System.out.println("---------后置通知Returning--------");
    }

    public Object aroundCall(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("---------执行环绕前置--------");
        Object proceed = joinPoint.proceed();
        System.out.println("---------执行环绕后置--------");
        return proceed;
    }
}
