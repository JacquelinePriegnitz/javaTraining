package com.tts.pattern.factory;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdressMenue implements IMenu{

	@Override
	public void showMenue() {

			try{
				
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				
				while(true)
				{
					System.out.println("a - Adresse anlegen");
					System.out.println("b - Adresse löschen");
					System.out.println("c - Adressbuch anzeigen");
					System.out.println("q - Programm beenden ");
					
					String selection = input.readLine();
					
					if(selection.equals("q"))
							break;
							
					switch(selection)
					{
						case "a":
							newAdresse();
							break;
						case "b":
							deleteAdresse();
						case "c":
							showAllAdresses();
						
					
					}
				}
				
			}catch(IOException ex){
				System.out.println("Fehler!");
			}
	
	}

	private void showAllAdresses() {
		
	}

	private void deleteAdresse() {
		// TODO Auto-generated method stub
		
	}

	private void newAdresse() {
		// TODO Auto-generated method stub
		
	}
	

}
