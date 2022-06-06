package org.example.aop;

import org.aspectj.lang.JoinPoint;
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
}
