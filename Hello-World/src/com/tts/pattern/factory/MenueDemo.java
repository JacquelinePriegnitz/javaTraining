package com.tts.pattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.tts.mathis.IMenue;
import com.tts.mathis.MenueFactory;

public class MenueDemo {
	
	public static void main(String[] args) {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			while(true)
			{
				System.out.println("Willkommen! Welches menue soll angezeigt werden?");
				System.out.println("1. Mitarbeitermenü ");
				System.out.println("2. Adressmenü ");
				System.out.println("0. Programm beenden");
			
				String selection = input.readLine();
			
				if(selection.equals("0"))
					break;
				
				IMenue menue = MenueFactory.getInstance(selection);
				menue.showMenue();
			}
			
		}catch(IOException ex){
			System.out.println("Fehler!");
		}
	}

}
