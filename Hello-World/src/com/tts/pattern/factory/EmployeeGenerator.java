package com.tts.pattern.factory;

public class EmployeeGenerator implements INumberGenerator{

	private int number;
	
	@Override
	public String getId() {
		number++;
		return String.valueOf(number);
	}
	
	

}
