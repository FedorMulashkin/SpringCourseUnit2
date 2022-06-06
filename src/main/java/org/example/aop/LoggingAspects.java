package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {
    @Pointcut("execution(* get*())")
    public void getAdvice(){}

    @Pointcut("execution(* set*(..))")
    public void setAdvice(){}

    @Before("setAdvice()")
    public void beforeSetAdvice(JoinPoint joinPoint){
        System.out.println("BeforeSetAdvice for method " + joinPoint.getSignature().getName());
    }

    @Around("setAdvice()")
    public void aroundSetAdvice(ProceedingJoinPoint point){
        System.out.println("Before task proceeding aroundSetAdvice");
        try {
            point.proceed();
            System.out.println("Setting up some information...");
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("After task proceeding aroundSetAdvice");
    }
}
