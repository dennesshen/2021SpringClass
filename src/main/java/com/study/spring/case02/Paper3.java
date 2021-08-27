package com.study.spring.case02;

public class Paper3 {
	private Integer id;
	private Color color;
	private Size size2;
	
	
	public Paper3() {
	}
	public Paper3(Color color, Size size2) {
		this.color = color;
		this.size2 = size2;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Paper3 [id=" + id + ", color=" + color + ", size2=" + size2 + "]";
	}
	
	
	
	
}
