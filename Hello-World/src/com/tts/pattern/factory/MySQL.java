package com.tts.pattern.factory;

import java.sql.*;

/*
 * Konkrete Implementierung einer MYSQL-DB KLasse
 */
public class MySQL implements IJDBC{
	
	Connection con; // Hier bin ich unsicher, ob dies wirklich Klasseneigenschaften sein müssen ?
	Statement stmt; // MUss ich nochmal überdenken
	private String driver;
	private String url;
	private String user;
	private String password;
	private String sql;
	
	
	public void setDBDriver(String driver);
	public void setDBUrl(String url);
	public void setDBUSer(String user);
	public void setDBPassword(String password);
	public void setDBProperties(String driver,String url,String user,String password);
	
	public void saveData(Person person);
	public void readData(Person person);
	public void deleteData(Person person);

	public void createDBConnection();
	public void closeConnection(Connection con);
}
