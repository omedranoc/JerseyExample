package com.remotetiger.forms;

public class ResultDto {
	private double area;
	private boolean equal;
	private String name;
	
	
	@Override
	public String toString() {
		return "ResultForm [area=" + area + ", equal=" + equal + ", name=" + name + "]";
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isEqual() {
		return equal;
	}
	public void setEqual(boolean equal) {
		this.equal = equal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
