package com.example.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoLoggingAspect {

    @Before("com.example.aop.aspect.CommonPointcutExpressions.forDaoPackage()")
    public void beforeDaoPackageAdvice(JoinPoint joinPoint) {
        System.out.println("\n=================>> Executing @Before advice on DAO package()");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method signature: " + signature);
        System.out.println("Arguments:");
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
    }
}
