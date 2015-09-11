package com.tts.pattern.factory;

import java.sql.*; 
/*
 * DB-Interface, damit unterschiedliche Datenbanken verwendet werden können
 */
public interface IJDBC {

	public void setDBDriver(String driver);
	public void setDBUrl(String url);
	public void setDBUSer(String user);
	public void setDBPassword(String password);
	public void setDBProperties(String driver,String url,String user,String password);
	
	public void saveData(Person person);
	public void readData(Person person);
	public void deleteData(Person person);
	
	
}
