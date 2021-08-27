package com.study.spring.case02;

import java.util.Set;

public class Student {
	private Integer id;
	private String name;
	private Set<Clazz> clazzs;
	private Integer allCredits = 0;
	
	
	
	public Student() {
		System.out.println("Student Constructor");

	}
	
	public void init() {
		System.out.println("Student init");
		System.out.println(super.toString());
	}
	
	public void destroy() {
		System.out.println("Student Destroy");

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Clazz> getClazzs() {
		return clazzs;
	}

	public void setClazzs(Set<Clazz> clazzs) {
		this.clazzs = clazzs;
	}
	
	
	
	public Integer getAllCredits() {
		allCredits = 0;
		calcAllCredits();
		return allCredits;
	}

	private void calcAllCredits() {
		clazzs.stream().forEach( c -> allCredits += c.getCredit() );
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clazzs=" + clazzs + "]";
	}
	

	

	
	
	
	
	
}
