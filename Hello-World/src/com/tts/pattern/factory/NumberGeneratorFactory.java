package com.tts.pattern.factory;

public class NumberGeneratorFactory {

	private static INumberGenerator employeeGenerator;
	private static INumberGenerator externalGenerator;

	private NumberGeneratorFactory() {

	}

	public static INumberGenerator getInstance(Person person) {
		if (person instanceof Employee) {
			if (employeeGenerator == null) {
				employeeGenerator = new EmployeeGenerator();
			}
			return employeeGenerator;
		}
		if (person instanceof externalEmployee) {
			if (externalGenerator == null) {
				externalGenerator = new ExternalGenerator();
			}
			return externalGenerator;
		}
		return null;
	}
	


}
