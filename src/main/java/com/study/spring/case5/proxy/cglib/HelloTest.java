package com.study.spring.case5.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class HelloTest {
	public static void main(String[] args) {
		//使用子類別來代理
		Hello hello1 = new EnhancerHello();
		System.out.println(hello1.sayHello("Vincent"));
		
		
		
		//使用cglib 
		Enhancer enhancer = new Enhancer();/////????????????一直報錯
		enhancer.setSuperclass(Hello.class);
		enhancer.setCallback(new MyMethodInterceptor());;
		Hello hello2 = (Hello) enhancer.create();
		System.out.println(hello2.sayHello("John"));
	}
}
