package com.tts.pattern.factory;

public abstract class Person {
	
	private String id;
	private String firstName;
	private String lastName;
	private Adresse adresse;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAdresse(Adresse adresse){
		this.adresse = adresse;
	}
	
	public Adresse getAdresse(){
		return this.adresse;
	}

	@Override
	public String toString() {
		return "Mitarbeiter: PersonalID=" + id + ", Vorname =" + firstName
				+ ", Nachname=" + lastName + ", " + adresse.toString();
	}


}
