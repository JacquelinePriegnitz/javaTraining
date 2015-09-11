package com.tts.pattern.factory;

public class ExternalGenerator implements INumberGenerator {

	private String id;
	private int number;
	
	@Override
	public String getId() {
		number++;
		id = "h" + String.valueOf(number);
		return id;
	}

	
}
