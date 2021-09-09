package com.study.spring.case06.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
 
public class DeleteEmp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		
		int id =6;
		String sqlString = "Delete from emp where eid=?";
		int rountcount = jdbcTemplate.update(sqlString, id);
		System.out.println("Delete rountcount:"+rountcount);
	}

}
