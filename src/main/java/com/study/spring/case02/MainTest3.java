package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest3 {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Teacher t1 = (Teacher) ctx.getBean("teacher1");
		Teacher t2 = (Teacher) ctx.getBean("teacher2");
		Teacher t3 = (Teacher) ctx.getBean("teacher3");

		System.out.println(t1);
		System.out.println(t1.getTotalStudentsCredits());
		System.out.println(t2);
		System.out.println(t2.getTotalStudentsCredits());
		System.out.println(t3);


	}

}
