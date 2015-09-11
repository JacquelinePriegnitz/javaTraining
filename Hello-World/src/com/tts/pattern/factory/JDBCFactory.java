package com.tts.pattern.factory;

/*
 * Factory zum Instanzieren von IJDB-Klassenobjekten.
 * Benutzung der Factory, da dadurch sichergestellt ist, dass nur eine DB-Verbindung geöffnet werden kann und nicht mehrer paralell. 
 * Verhindert die Erzeugung mehrere DB-Instanzen (Singelton)
 * 
 */
public class JDBCFactory {

	private static IJDBC mySQL;
	private static IJDBC andereDB;
	
	private JDBCFactory(){
		
	}
	
	public static IJDBC getInstance(String db) {
		if(db.equals("1")) 
		{
			if(mySQL == null)
			{
				mySQL = new MySQL();
			}
			return mySQL;
		}
		/*if(db.equals("2"))
		{
			if(andereDB = null)
			{
				andereDB = new AndereDB();
			}
			return andereDB;
		}*/
	}
}
