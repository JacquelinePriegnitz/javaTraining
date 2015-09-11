package com.tts.pattern.factory;

public class MenuFactory {
	
	private static IMenu employeeMenue;
	private static IMenu adressMenue;

	private MenuFactory() {

	}

	public static IMenu getInstance(String menueSelection) {
		if (menueSelection.equals("1") ) {
			if (employeeMenue == null) {
				employeeMenue = new EmployeeMenue();
			}
			return employeeMenue;
		}
		if (menueSelection.equals("2")) {
			if (adressMenue == null) {
				adressMenue = new AdressMenue();
			}
			return adressMenue;
		}
		return null;
	}
	


}
