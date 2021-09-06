package com.study.spring.case05.aop_dancer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//用java配置代替AOP-Config.xml
//test1
@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class AOPConfig {
	
	@Bean(name = "audience")
	public Audience audience() {
		return new Audience();
	}
	
	@Bean(name = "dancer")
	public Performance dancer() {
		return new Dancer();
	}
	
	@Bean
	Introductor getIntroductor() {
		return new Introductor();
	}
	
}
