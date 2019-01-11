package com.hust.edu.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * locate com.hust.edu.advice
 * Created by MasterTj on 2019/1/10.
 * 异常通知 只有当切点报异常后，才能触发异常通知
 */
@Component
@Aspect
public class MyAdvice{
    @AfterThrowing(value = "com.hust.edu.pointcut.Worker.doSomething(String)", throwing = "e")
    public void myExeception(Exception e){
        System.out.println("---------执行异常通知--------");
        System.out.println(e.getMessage());
    }

    @Before(value = "com.hust.edu.pointcut.Worker.doSomething(String) && args(name)", argNames = "name")
    public void beforeCall(String name){
        System.out.println("name: "+name);
        System.out.println("---------执行前置--------");
    }

    @After(value = "com.hust.edu.pointcut.Worker.doSomething(String) && args(name)", argNames = "name")
    public void afterCall(String name){
        System.out.println("name: "+name);
        System.out.println("---------执行后置--------");
    }

    @AfterReturning(value = "com.hust.edu.pointcut.Worker.doSomething(String) && args(name)", argNames = "name")
    public void afterCallReturning(String name){
        System.out.println("name: "+name);
        System.out.println("---------后置通知Returning--------");
    }

    @Around(value = "com.hust.edu.pointcut.Worker.doSomething(String) && args(name)" ,argNames = "joinPoint,name")
    public Object aroundCall(ProceedingJoinPoint joinPoint,String name) throws Throwable {
        System.out.println("---------执行环绕前置--------");
        Object proceed = joinPoint.proceed();
        System.out.println("---------执行环绕后置--------");
        System.out.println("name: "+name);
        return proceed;
    }
}
