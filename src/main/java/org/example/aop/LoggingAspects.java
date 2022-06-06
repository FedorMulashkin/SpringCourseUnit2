package org.example.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspects {
    @Before("execution(* get*())")
    public void beforeGetAdvice(JoinPoint joinPoint){
        System.out.println("BeforeGetAdvice for method " + joinPoint.getSignature().getName());
    }

    @Around("execution(* set*(..))")
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
