package com.study.spring.case5.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop_conf.xml");
		Calc calc = ctx.getBean("calcImpl",Calc.class);
		System.out.println(calc.add(2, 1));
		System.out.println(calc.div(10, 2));
	}
}
