package com.study.spring.case5.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect     //切面
@Order(1)	//數字越小越先被執行
public class MyLoggerAspect {
	
		// 前置通知
		public static void before(JoinPoint joinPoint) {
			System.out.println("前置通知: - " );
			String methodName = joinPoint.getSignature().getName();//方法獲取
			
		}

		// 後置通知
		public static void end(Class cls, String methodname, Object result) {
			System.out.printf("後置通知: %s, %s, %s\n", cls, methodname, result);
		}
		
		// 異常通知
		public static void throwing(Class cls, String errMessager) {
			System.out.printf("異常通知: %s, %s\n",cls,errMessager);
		}


}
