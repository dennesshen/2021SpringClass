package com.study.spring.case02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
		Student student1 = (Student) ctx.getBean("student1");
		Student student2 = (Student) ctx.getBean("student1");
		Student student3 = (Student) ctx.getBean("student1");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
