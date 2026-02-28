package com.jdbc.practice;

import java.sql.DriverManager;
import java.sql.Connection;

public class ConnectionProvider {
	
	private static Connection con;
	public static Connection getConnection() {
		try {
			
		
		
		
		if(con==null) {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","2003@lokesh");
			
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
