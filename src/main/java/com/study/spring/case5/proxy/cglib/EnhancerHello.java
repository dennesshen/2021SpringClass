package com.study.spring.case5.proxy.cglib;

//Enhancer 增強的 Hello
public class EnhancerHello extends Hello{

	@Override // 攔截者
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return super.sayHello(str)+"，麻煩請出示實聯制";
	}

}
