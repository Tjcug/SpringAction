package com.hust.edu.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * locate com.hust.edu.advice
 * Created by MasterTj on 2019/1/10.
 * 实现环绕通知
 */
public class AroundAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("---------执行前置--------");
        Object proceed = methodInvocation.proceed();
        System.out.println("---------后置通知--------");
        return proceed;
    }
}
