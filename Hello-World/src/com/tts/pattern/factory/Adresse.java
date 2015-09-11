package com.tts.pattern.factory;

public class Adresse {

	private String street;
	private String city;
	private String zipCode;
	
	public Adresse(String street, String city, String zipCode){
		setStreet(street);
		setCityt(city);
		setZipCode(zipCode);
	}

	public Adresse(){
		
	}
	
	public void setStreet(String street){
		this.street = street;
	}
	
	public String getStreet(){
		return this.street;
	}
	
	public void setCityt(String city){
		this.city = city;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public void setZipCode(String zipCode){
		this.zipCode = zipCode;
	}
	
	public String getZipCode(){
		return this.zipCode;
	}
	@Override
	public String toString() {
		return "Adresse: Strasse:" + street + ", PLZ=" + zipCode + ", Ort: " + city;
	}

}
