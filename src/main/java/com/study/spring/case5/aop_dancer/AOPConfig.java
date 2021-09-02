package com.study.spring.case5.aop_dancer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.w3c.dom.ls.LSOutput;

//用java配置代替AOP-Config.xml
//test1
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfig {
	@Bean(name = "dancer")
	public Performance dancer() {
		System.out.println("testMac");
		return new Dancer();
	}
	
}
