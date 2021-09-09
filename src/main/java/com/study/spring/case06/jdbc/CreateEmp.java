package com.study.spring.case06.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;

public class CreateEmp {
	ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_config.xml");
	JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);

	@Test
	public void test() { 
		//case1();
		//case2();
		case3();
	}
	//單筆新增
	public void case1() {
		String sqlString = "Insert into emp(ename,age) value(?,?) ";
		jdbcTemplate.update(sqlString,"Jo",21);
		System.out.println("Insert Sucess 1");
	}
	
	//多筆新增-I
	public void case2() {
		String sqlString = "Insert into emp(ename,age) value(?,?) ";
		List<Object[]> list = new ArrayList<Object[]>();
		list.add(new Object[] {"Jean",22});
		list.add(new Object[] {"Helen",22});
		list.add(new Object[] {"Jack",24});
		int[] rows = jdbcTemplate.batchUpdate(sqlString,list);
		System.out.println(Arrays.toString(rows));	
	}
	
	//多筆新增-II
	public void case3() {
		String sqlString = "Insert into emp(ename,age) value(?,?) ";
		List<Emp> emps = Arrays.asList(
				new Emp("Christine",25),
				new Emp("Iris",24)
		);
		BatchPreparedStatementSetter setter = new BatchPreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				// i = Emps 的 index
				ps.setString(1, emps.get(i).getEname());
				ps.setInt(2, emps.get(i).getAge());
			}
			
			@Override
			public int getBatchSize() {
				return emps.size();
			}
		};
		
		int[] rows = jdbcTemplate.batchUpdate(sqlString,setter);
		System.out.println(Arrays.toString(rows));	
	}
	
	
}
