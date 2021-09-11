package com.study.spring.case06.jdbc;

import java.sql.ResultSet;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class SelectEmp {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc_config.xml");
		JdbcTemplate jdbcTemplate = ctx.getBean("jdbcTemplate",JdbcTemplate.class);
		String sqlString = "select eid, ename, age, createtime from emp";
		//Map<String, Object> map = jdbcTemplate.queryForMap(sqlString);
		
		//多筆查詢
		List< Map<String, Object> > emps = jdbcTemplate.queryForList(sqlString);
		System.out.println(emps);
		for (Map<String, Object> emp : emps) {
			System.out.println(emp.get("ename"));	
		}
		
		//單筆單欄查詢
		//現在emp資料表當中有幾筆資料
		sqlString = "select count(*) from emp";
		Integer count = jdbcTemplate.queryForObject(sqlString, Integer.class);
		System.out.println("資料筆數:"+count);
		
		
		//多筆查詢-Entity(RowMapper)
		sqlString = "select eid, ename, age, createtime from emp";
		List<Emp> listEmps = jdbcTemplate.query(sqlString, (ResultSet rs, int rowNum)->{
			Emp emp = new Emp();
			Integer eid = rs.getInt("eid");
			String ename = rs.getString("ename");
			Integer age = rs.getInt("age");
			Date createtime = rs.getDate("createtime");
			emp.setEid(eid);
			emp.setEname(ename);
			emp.setAge(age);
			emp.setCreatetime(createtime);
			return emp; 
		});
		System.out.println(listEmps);
		
		//多筆查詢-BeanPropertyRowMapper
		sqlString = "select eid, ename, age, createtime from emp";
		List<Emp> listEmps2 = jdbcTemplate.query(sqlString, new BeanPropertyRowMapper<>(Emp.class));
		System.out.println(listEmps2);

	}

}
