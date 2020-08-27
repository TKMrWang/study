package com.itxiaobai.wx.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class MyAspect {

    @Pointcut("execution(* com.itxiaobai.wx.bean..*.*(..))")
    public void pointCut(){};


    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName()+"方法运行倩...before,参数列表是"+ Arrays.asList(args));
    }

    @After(value = "pointCut()")
    public void after(){
        System.out.println("方法运行倩...after");
    }

    @AfterReturning(value = "pointCut()",returning = "result")
    public void endReturn(JoinPoint joinPoint,Object result){
        System.out.println(joinPoint.getSignature().getName()+"方法运行返回后...endReturn,返回为："+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void afterThrow(Exception e){
        System.out.println("返回异常：" + e.getMessage());
    }

    @Around(value = "pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around------aaaaaa");
        Object proceed = joinPoint.proceed();
        System.out.println("around-------bbbbbb");
        return proceed;
    }
}
