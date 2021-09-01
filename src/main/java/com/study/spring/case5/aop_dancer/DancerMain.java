package com.study.spring.case5.aop_dancer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DancerMain {
	public static void main(String[] args) {
		ApplicationContext ctxApplicationContext = new AnnotationConfigApplicationContext(AOPConfig.class);
		Performance performance = ctxApplicationContext.getBean("dancer",Dancer.class);
		performance.perform();
	}
}
