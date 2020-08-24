package com.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 *
 */
public class MyAdvice{
	public void mybefore(JoinPoint joinPoint,String name,int age) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~前置1");
		System.out.println("前置1"+name+age);
		System.out.println("前置1  目标类："+joinPoint.getTarget());
		System.out.println("前置1 织入增强类的目标方法："+joinPoint.getSignature().getName());
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~前置1");
	}
	public void mybefore1(String name) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~前置2");
		System.out.println("前置2"+name);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~前置2");
	}
	public void myafter1(String name) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~后置1");
		System.out.println("后置1");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~后置1");
	}
	public void myafter2(String name) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~后置2");
		System.out.println("后置2");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~后置2");
	}
	public void mythrow(String name) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~异常");
		System.out.println("异常");
	}
	public void myexception(Exception e1) {
		System.out.println("执行异常通知"+ e1.getMessage());
	}
	public Object myarround(ProceedingJoinPoint p) throws Throwable {
		System.out.println("~~~~~~~~~~~~~~~环绕前置");
		Object proceed = p.proceed();
		System.out.println("~~~~~~~~~~~~~~~环绕后置");
		return proceed;
	}
}
