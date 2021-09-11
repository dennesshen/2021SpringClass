package com.study.spring.case06.tx.dao;

import org.omg.SendingContext.RunTime;
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
		Object[] args = new Object[] {bid};
		//檢查庫存
		String sqlQuery = "select amount from stock where bid=?";
		int amount = jdbcTemplate.queryForObject(sqlQuery,args,Integer.class);
		if(amount<= 0) {
			throw new RuntimeException("庫存不足");
		}
		
		//修改庫存
		String sqlString = "update stock set amount = amount -1 where bid=?";
		return jdbcTemplate.update(sqlString, args);
	}

	@Override
	public Integer updateWallet(Integer wid, Integer money) {
		Object[] args = new Object[] {wid};
		//檢查餘額是否足夠
		String sqlQuery = "select money from wallet where wid=?";
		int moneyNow = jdbcTemplate.queryForObject(sqlQuery, args, Integer.class);
		
		if(moneyNow < money) {
			throw new RuntimeException("餘額不足");
		}
		
		//更改餘額
		args = new Object[] {money, wid};
		String sqlString = "update wallet set money = money - ? where wid= ? ";
		return jdbcTemplate.update(sqlString, args);
	}
	
}
