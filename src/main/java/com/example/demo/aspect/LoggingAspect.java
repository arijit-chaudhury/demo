package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("@annotation(com.example.demo.annotation.Log)")
    public void logPointCut(){
    }

    @Before("logPointCut()")
    public void logAllMethodCallsAdvice(){
        System.out.println("In before aspect!");
    }

    @Pointcut("execution(public void com.example.demo.controller.FileController.getUploadData())")
    public void logPointCutWithExecution(){
    }

    @Before("logPointCutWithExecution()")
    public void logMethodCallsWithExecutionAdvice(){
        System.out.println("In Aspect from execution!");
    }

    @Pointcut("execution(public void com.example.demo.controller.FileController.getTestData())")
    public void logPointCutWithExecutionAround(){
    }

    @Around("logPointCutWithExecutionAround()")
    public void logMethodCallsWithExecutionAdviceAround(ProceedingJoinPoint joinPoint){
        System.out.println("In Aspect from execution around!");
    }
}
