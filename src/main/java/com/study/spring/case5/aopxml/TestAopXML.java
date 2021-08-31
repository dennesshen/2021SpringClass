package com.study.spring.case5.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAopXML {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopxml_config.xml");
		Calc calc = ctx.getBean("calcImpl",Calc.class);
		System.out.println(calc.add(2, 1));
		System.out.println(calc.div(10,4));
	}
}
