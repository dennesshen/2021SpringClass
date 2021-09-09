package com.study.spring.case06.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.study.spring.case06.tx.dao.BookDao;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
		
	
	@Override
	public void buyOne(Integer wid, Integer bid) {
		int price = bookDao.getPrice(bid);
		bookDao.updateStock(bid);//減去庫存
		bookDao.updateWallet(wid, price);//錢包餘額扣款
	}

	@Override
	public void buyMany(Integer wid, Integer... bid) {
		// TODO Auto-generated method stub
		
	}
	
}
