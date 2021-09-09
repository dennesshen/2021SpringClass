package com.study.spring.case06.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.study.spring.case06.tx.controller.BookController;
import com.study.spring.case06.tx.controller.BookControllerImpl;

public class BuyBookMain {

	public static void main(String[] args) {
		//Wallet 1 要買 Book1
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class); 
		
		BookController bookController = ctx.getBean("bookControllerImpl", BookController.class);
		int wid = 1;
		int bid = 1;
		bookController.buyBook(wid, bid);
		
	}

}
