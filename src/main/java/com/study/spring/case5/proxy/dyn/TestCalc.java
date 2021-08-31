package com.study.spring.case5.proxy.dyn;

public class TestCalc {

	public static void main(String[] args) {
		Calc calc = (Calc) new ProxyUtil(new CalcImpl()).getProxy();
		System.out.println(calc.add(10, 20));
		System.out.println(calc.div(10, 1));


	}

}
