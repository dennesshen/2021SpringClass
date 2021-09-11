package com.study.spring.case5.aop_dancer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DancerMain {
	public static void main(String[] args) {
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(AOPConfig.class);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aop_dancer_Config.xml") ;
		Performance performance = (Performance)ctx.getBean("dancer");
		
		try {
			performance.perform();
		} catch (Exception e) {
			System.out.println(e);
			//轉換跑道
			//舞蹈轉唱歌
			Singer singer = (Singer) performance;
			singer.sing();
			
			Actor actor = (Actor) singer;
			actor.show();
		}
		
	}
}
