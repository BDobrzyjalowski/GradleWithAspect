package com.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TestAspect {
    @Pointcut("execution(* MyApp.main(..))")
    void myStartPointCut() {

    }

    @Before("myStartPointCut()")
    public void logBeforeMainMethod(JoinPoint joinPoint) {
        System.out.println(String.format("Method %s started", joinPoint.getSignature()));
    }

    @After("myStartPointCut()")
    public void logAfterMainMethod(JoinPoint joinPoint) {
        System.out.println(String.format("Method %s finished", joinPoint.getSignature()));
    }

}
