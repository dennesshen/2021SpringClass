package com.study.spring.case5.aop_dancer;

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
	@Bean(name = "dancer")
	public Performance dancer() {
		return new Dancer();
	}
	
}
