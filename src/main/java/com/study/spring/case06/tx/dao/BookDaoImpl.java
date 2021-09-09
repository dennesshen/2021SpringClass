package com.study.spring.case06.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer getPrice(Integer bid) {
		String sqlString = "Select price from book where bid=?";
		Object[] args = new Object[] {bid};
		return jdbcTemplate.queryForObject(sqlString, args, Integer.class );
	}

	@Override
	public Integer updateStock(Integer bid) {
		String sqlString = "update stock set amount = amount -1 where bid=?";
		Object[] args = new Object[] {bid};
		return jdbcTemplate.update(sqlString, args);
	}

	@Override
	public Integer updateWallet(Integer wid, Integer money) {
		String sqlString = "update wallet set money = money - ? where wid= ? ";
		Object[] args = new Object[] {money, wid};
		return jdbcTemplate.update(sqlString, args);
	}
	
}
