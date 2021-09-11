package com.study.spring.case06.tx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.study.spring.case06.tx.service.BookService;

@Controller
public class BookControllerImpl implements BookController{
	
	@Autowired
	private BookService bookService;
	
	@Override
	public void buyBook(Integer wid, Integer bid) {
		bookService.buyOne(wid, bid);
		System.out.println("Buy book ok");
	}

	@Override
	public void buyBooks(Integer wid, Integer... bids) {
		bookService.buyMany(wid, bids);
		System.out.println("buy many books ok");
	}

}
