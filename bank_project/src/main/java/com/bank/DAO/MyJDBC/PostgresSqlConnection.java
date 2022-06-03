package com.bank.DAO.MyJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//Created Connector between MYSQL and Java
//Make sure to connect to "bank" that is the database used for this program
//Used DriverManager to get connection with url, username and password
//Connection returns perfectly
public class PostgresSqlConnection {
	private static Connection connection;
	
	private PostgresSqlConnection() {
		// TODO Auto-generated constructor stub
	}
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/bank";
		String username="root";
		String password="Ale.zubi99";
		connection=DriverManager.getConnection(url, username, password);
		return connection;
	}
}
