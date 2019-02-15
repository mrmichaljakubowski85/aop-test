package com.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Pointcut("execution(* com.example.aop.dao.*.*(..))")
    public void forDaoPackage() {
    }

    @Pointcut("execution(* com.example.aop.dao.*.get*(..))")
    public void getter() {
    }

    @Pointcut("execution(* com.example.aop.dao.*.set*(..))")
    public void setter() {
    }

    @Pointcut("forDaoPackage() && !(getter() || setter())")
    public void forDaoPackageNoGetterSetter() {}

    @Before("forDaoPackage()")
    public void beforeDaoPackageAdvice() {
        System.out.println("\n=================>> Executing @Before advice on DAO package()");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performApiAnalytics() {
        System.out.println("\n=================>> Performing API analytics");
    }

}
