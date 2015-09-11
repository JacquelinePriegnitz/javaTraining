package com.tts.pattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeMenue implements IMenu {

	private PersonDAO personDAO = new PersonDAO(); 

	@Override
	public void showMenue() {
		try
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.println("a - Mitarbeiter anlegen");
				System.out.println("b - externen Mitarbeiter anlegen");
				System.out.println("c - Mitarbeiter löschen");
				System.out.println("d - Mitarbeiter anzeigen");
				System.out.println("q - Programm beenden");
				
				String auswahl = input.readLine();

				if(auswahl.equals("q"))
					break;
				
				switch(auswahl)
				{
					case "a":
						mitarbeiterAnlegenMenu();
						break;
					case "b":
						externenMitarbeiterAnlegenMenu();
						break;
					case "c":
						mitarbeiterLoeschenMenu();
						break;
					case "d":
						mitarbeiterAnzeigenMenu();
						break;
				}
			}
		}
		catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Das hat nicht funktioniert!");
		}
		
	}
	
	private void mitarbeiterAnzeigenMenu() {

		System.out.println("Mitarbeiterliste: \n");
		personDAO.showAllPersons();
	}
	
	private void mitarbeiterLoeschenMenu() throws NumberFormatException, IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		boolean deleted = false;
		if(personDAO.getAllPersons().size() > 0)
		{
			System.out.println("Welchen Mitarbeiter wollen Sie loeschen? Bitte PersonalID angeben:");
			personDAO.showAllPersons();
			deleted = personDAO.deletePersonByID(input.readLine());
			if(deleted == true)
			{
				System.out.println("Mitarbeiter erfolgreich gelöscht!");
			}
			else{
				System.out.println("MitarbeiterID nicht vorhanden!");
			}
		}
		else
		{
			System.out.println("Keine Mitarbeiter zum löschen vorhanden!");
		}
	}

	private void externenMitarbeiterAnlegenMenu() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		externalEmployee extEmployee = new externalEmployee();
		Adresse adresse = new Adresse();
		
		System.out.println("Bitte Vornamen eingeben:");
		extEmployee.setFirstName(input.readLine());
		System.out.println("Bitte Nachnamen eingeben:");
		extEmployee.setLastName(input.readLine());
		System.out.println("Bitte Adresse eingeben:");
		System.out.println("Strasse:");
		adresse.setStreet(input.readLine());
		System.out.println("Postleitzahl:");
		adresse.setZipCode(input.readLine());
		System.out.println("Ort:");
		adresse.setCityt(input.readLine());
		extEmployee.setAdresse(adresse);
		System.out.println("Personalnummer wird automatisch vergeben");
		personDAO.addNewPerson(extEmployee);
		
	}

	private void mitarbeiterAnlegenMenu() throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		Employee employee = new Employee();
		Adresse adresse = new Adresse();
		
		System.out.println("Bitte Vornamen eingeben:");
		employee.setFirstName(input.readLine());
		System.out.println("Bitte Nachnamen eingeben:");
		employee.setLastName(input.readLine());
		System.out.println("Bitte Bürostandort eingeben:");
		employee.setOffice(input.readLine());
		System.out.println("Bitte Adresse eingeben:");
		System.out.println("Strasse:");
		adresse.setStreet(input.readLine());
		System.out.println("Postleitzahl:");
		adresse.setZipCode(input.readLine());
		System.out.println("Ort:");
		adresse.setCityt(input.readLine());
		employee.setAdresse(adresse);
		System.out.println("Personalnummer wird automatisch vergeben");
		personDAO.addNewPerson(employee);
	}


}
