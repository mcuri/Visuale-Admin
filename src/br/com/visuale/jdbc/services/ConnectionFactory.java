package br.com.visuale.jdbc.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection(){
		System.out.println("Connecting to database.");

		try{
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/visuale", "root", "admin");	
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}
}