package com.study.spring.case05.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect     //切面
@Order(1)	//數字越小越先被執行
public class MyLoggerAspect {

		//Pointcut 切入點用來定義連接點在哪裡
		@Pointcut(value = "execution(public Integer com.study.spring.case05.aop.CalcImpl.*(..))")
		public void pt1() {}
		
		@Pointcut(value = "execution(public Integer com.study.spring.case05.aop.CalcImpl.div(..))")
		public void pt2() {}
		
		//前置通知
		//指定特定類特定方法
		//@Before(value = "execution( public int com.study.spring.case05.aop.CalcImpl.add(int, int) )")
		//指定特定類所有方法
		//@Before(value = "execution( public int com.study.spring.case05.aop.CalcImpl.*(..) )")
		//@Before(value = "execution( * *.*(..) )")
		//@Before(value = "pt1() && !pt2()")//切入點表達式支援 條件運算子
		
		/*
		@Before(value = "pt1()")
		public static void before(JoinPoint joinPoint) {
			System.out.println("前置通知: - " );
			String methodName = joinPoint.getSignature().getName();//方法獲取
			Object[] args = joinPoint.getArgs();
			System.out.printf("方法名稱:%s，方法參數:%s\n",methodName,Arrays.toString(args));
		}
		
		//後置通知
		@After(value = "pt1()")
		public void after() {
			System.out.println("後置通知 -");
		}
		
		//返回通知(可以設定來接收方法的返回值)
		@AfterReturning(value = "pt1()", returning = "result" )
		public void afterReturning(Object result) {
			System.out.println("返回通知-result="+result);
		}
		
		//異常通知
		@AfterThrowing(value = "pt1()", throwing = "ex")
		public void afterThrowing(Exception ex) {
			System.out.println("異常通知 - ex :" + ex );
		}
		
		*/
		
		//環繞通知
		@Around(value = "pt1()")
		public Object arround(ProceedingJoinPoint jointPoint) {
			Object result = null;
			
			try {
				//1.前置通知
				String methodName = jointPoint.getSignature().getName();
				Object[] args = jointPoint.getArgs();
				System.out.println("環繞通知_前置通知: - " );
				System.out.printf("方法名稱:%s，方法參數:%s\n",methodName,Arrays.toString(args));
				result = jointPoint.proceed();
				//2.返回通知
				System.out.println("環繞通知_返回通知");

			} catch (Throwable ex) {
				//3.異常通知
				System.out.println("環繞通知_異常通知 - ex :" + ex );
			}finally {
				//4.後置通知
				System.out.println("環繞通知_後置通知 -");
			}
			
			
			return result;
		}
		

		
		


}
