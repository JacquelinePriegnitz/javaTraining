package com.tts.pattern.factory;

public class externalEmployee extends Person{

	
	public externalEmployee() {
		super();
	}

	public String toString() {
		return "externer Mitarbeiter: PersonalID=" + getId() + ", Vorname =" + getFirstName()
				+ ", Nachname=" + getLastName()+ ", " + getAdresse().toString();
	}


}
