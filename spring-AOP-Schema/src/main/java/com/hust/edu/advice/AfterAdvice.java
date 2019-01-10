package com.hust.edu.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * locate com.hust.edu.advice
 * Created by MasterTj on 2019/1/10.
 */
public class AfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("切点方法返回对象: "+o);
        System.out.println("切点方法对象："+method+ ", 方法名："+method.getName());
        if(method!=null && objects.length>0)
            System.out.println("切点方法参数："+objects);
        else
            System.out.println("切点所在方法没有参数.");
        System.out.println("切点方法对象："+o1);
        System.out.println("---------后置通知--------");
        System.out.println();
    }
}
