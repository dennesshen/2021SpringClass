package com.study.spring.case5.aopxml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component
public class MyLoggerXMLAspect {
	public void before(JoinPoint jointPoint) {
		System.out.println("AOP XML版-前置通知");
		String methodName =  jointPoint.getSignature().getName();
		Object[] args = jointPoint.getArgs();
		System.out.printf("方法名稱:%s，方法參數:%s\n",methodName,Arrays.toString(args));
	}
}
