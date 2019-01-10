package com.hust.edu.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * locate com.hust.edu.advice
 * Created by MasterTj on 2019/1/10.
 */
public class BeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("切点方法对象："+method+ ", 方法名："+method.getName());
        if(method!=null && objects.length>0)
            System.out.println("切点方法参数："+objects);
        else
            System.out.println("切点所在方法没有参数.");
        System.out.println("切点方法对象："+o.getClass());
        System.out.println("---------执行前置--------");
    }
}
