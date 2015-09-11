package com.tts.pattern.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class JdbcDAO {
	
	public void showDBMenu(){
		try
		{
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Welche DB möchten Sie verwenden?");
			System.out.println("1 = MySQL");
			System.out.println("2 = Andere");
			System.out.println("3 = Abbrechen");
			
			String selection = input.readLine();
				
			if(selection.equals("3"))
				break;
			else
			{
					IJDBC db = JDBCFactory.getInstance(selection);
					db.showMenue();
			}
		
		}catch(IOException ex){
			System.out.println("Fehler!");
		}
	}

}
