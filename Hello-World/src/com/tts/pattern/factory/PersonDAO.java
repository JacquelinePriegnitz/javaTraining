package com.tts.pattern.factory;

import java.util.ArrayList;
import java.util.List;


public class PersonDAO {

	private List<Person> listOfPersons = new ArrayList<Person>();
	
	
	public List<Person> getAllPersons(){
		return this.listOfPersons;
	}
	
	public void showAllPersons(){
		for (Person person : listOfPersons) 
		{
			System.out.println(person.toString());
		}
	}
	
	public void showPersonByID(String personalID){
		for (Person person : listOfPersons) 
		{
			if(person.getId().equals(personalID))
			{
				System.out.println(person.toString());
			}
		}
	}
	
	public void deleteAllPersons(){
		listOfPersons.clear();
	}
	
	public boolean deletePersonByID(String personalID){
		for(int i = 0; i < listOfPersons.size();i++)
		{
			Person person = (Person)listOfPersons.get(i);
			if(person.getId().equals(personalID))
			{
				listOfPersons.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public void addNewPerson(Person person){
		INumberGenerator numberGenerator = NumberGeneratorFactory.getInstance(person);
		person.setId(numberGenerator.getId());
		listOfPersons.add(person);
	}

}
