package com.study.spring.case02;

public class Paper2 {
	private Integer id;
	private Color red;
	private Size size2;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Color getRed() {
		return red;
	}
	public void setRed(Color red) {
		this.red = red;
	}
	public Size getSize2() {
		return size2;
	}
	public void setSize2(Size size2) {
		this.size2 = size2;
	}
	@Override
	public String toString() {
		return "Paper2 [id=" + id + ", red=" + red + ", size2=" + size2 + "]";
	}
	
	
	
}
