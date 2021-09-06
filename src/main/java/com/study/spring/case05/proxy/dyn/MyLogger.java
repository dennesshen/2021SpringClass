package com.study.spring.case05.proxy.dyn;

import java.util.Arrays;

//切面程式
public class MyLogger {

	// 前置通知
	public static void before(Class cls, String methodname, Object[] args) {
		System.out.printf("前置通知: %s, %s, %s\n", cls, methodname, Arrays.toString(args));
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
