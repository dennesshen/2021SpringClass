package com.study.spring.case5.proxy.dyn;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import com.study.spring.case5.proxy.sta.Man;
import com.study.spring.case5.proxy.sta.Person;
import com.study.spring.case5.proxy.sta.Woman;

public class testPerson {

	public static void main(String[] args) {
		Person p1 = (Person) new ProxyUtil(new Woman()).getProxy();
		Person p2 = (Person) new ProxyUtil(new Man()).getProxy();

		p1.work();
		p2.work();
	}

}
