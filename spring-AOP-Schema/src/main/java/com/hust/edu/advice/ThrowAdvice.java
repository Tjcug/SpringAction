package com.hust.edu.advice;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * locate com.hust.edu.advice
 * Created by MasterTj on 2019/1/10.
 * 异常通知 只有当切点报异常后，才能触发异常通知
 */
public class ThrowAdvice implements ThrowsAdvice{
    public void afterThrowing(Method method, Object[] objects, Object target, Exception ex) throws Throwable{
        //Do something with Exception
        System.out.println("执行异常 通过Schema-Based的方法执行异常: "+ex.getMessage());
    }

    public void afterThrowing(Exception ex) throws Throwable{
        //Do something with Exception
        System.out.println("执行异常 通过Schema-Based的方法执行异常2: "+ex.getMessage());
    }
}
