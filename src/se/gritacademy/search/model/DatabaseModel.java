package se.gritacademy.search.model;

public class DatabaseModel {
	
	
	private final static String uName = "root";
	private final static String pWord = "m2jvnRx6d37h6QEX";
	private final static String dbURL = "jdbc:mysql://localhost:3308/";
	private final static String dbName = "newgoogle";

	
	public static String getUname() {
		return uName;
	}
	public static String getPword() {
		return pWord;
	}
	public static String getDburl() {
		return dbURL;
	}
	public static String getDbname() {
		return dbName;
	}
	

}
