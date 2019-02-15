package com.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class DemoLoggingAspect {

    @Before("com.example.aop.aspect.CommonPointcutExpressions.forDaoPackage()")
    public void beforeDaoPackageAdvice() {
        System.out.println("\n=================>> Executing @Before advice on DAO package()");
    }
}
