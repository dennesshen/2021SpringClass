package com.study.spring.case06.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateEmp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		
		int id = 10;
		String sqlString = "Update emp set ename=?, age=? where eid=?";
		int rountcount = jdbcTemplate.update(sqlString, "John2", 27, id);
		System.out.println("Update rountcount:"+rountcount);
	}

}
