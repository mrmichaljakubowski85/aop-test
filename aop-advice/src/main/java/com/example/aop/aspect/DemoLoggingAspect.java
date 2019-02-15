package com.example.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {

    @Before("execution(* add*())")
    public void beforeAddAccountAdvice() {
        System.out.println("\n=================>> Executing @Before advice on addAccount()");
    }

    @Before("execution(* add*())")
    public void beforeAddAccountAdviceParam() {
        System.out.println("\nPARAM=================>> Executing @Before advice on addAccount()");
    }
}
