package com.study.spring.case5.proxy.sta;


public class ProxyDemo {
	
	public static void main(String[] Args) {
		Person p1 = new PersonProxy(new Man());
		Person p2 = new PersonProxy(new Woman());

		p1.work();
		p2.work();
		
		
	}

}
