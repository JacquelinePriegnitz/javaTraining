package com.tts.pattern.factory;

public class Employee extends Person{

	private String office;
	
	public Employee(){
		super();
	}

	public String getOffice(){
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	
}
