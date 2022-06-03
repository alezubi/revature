package com.bank.Service.impl;

import com.bank.Exceptions.BusinessException;
import com.bank.Service.MenuService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.DAO.MyJDBC.PostgresSqlConnection;
//Implemented all functions from the external interface
//This public class is going to define the body of the methods created in the interface
//Connection connection = PostgresSqlConnection.getConnection() USED TO ESTABLISH CONNECTION!
//FROM private PostgresSqlConnection() {
//		// TODO Auto-generated constructor stub     //MYJDBC
//	}
//Inserted my sql statement which is going to provide the action needed inside of my table
//Selected the values that wanted to be inserted
//Used PreparedStatement since it is use for pre-compiled SQL statement.
//Used try and catch to avoid unnecessary mistakes that could damage my data however it is not necessary
//All Mathematical Functions used here in order to set up the balance which is the most importante variable in this class!
//Used a local variable to stored the data in the first case scenario is double balance
//In some cases had to used ResultSet which is a Java object that contains the results of executing an SQL query
//To iterate ResultSet was used its next() method
//When it returns true if the ResultSet has a next record, and moves the ResultSet to point to the next record.
//All the variables or objects inside of the constructors or methods are going to replace that variable value

public class MenuServiceImpl implements MenuService{

	@Override
	public double withdrawAmount(int account_id, double newBalance) throws BusinessException {
				double balance = searchBalance(account_id);
				
				if (newBalance > 0) {
					balance = balance - newBalance;
				}else {
					throw new BusinessException("Enter a positive number");
				}
				return balance;
	}

	@Override
	public double depositAmount(int account_id, double newBalance) throws BusinessException {
				double balance = searchBalance(account_id);
				
				if (newBalance > 0) {	
					balance = balance + newBalance;
				}else {
					throw new BusinessException("Enter a positive number");
				}
				return balance;
	}
	
	@Override
	public double searchBalance(int account_id) throws BusinessException {
		double balance = 0;
		try (Connection connection = PostgresSqlConnection.getConnection()){
			String sql = "SELECT balance FROM bank.account WHERE account_id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, account_id);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				balance = resultSet.getDouble("balance");
			}else {
				throw new BusinessException("No bank account with account id: " + account_id);
			}
			
		}catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return balance;
	}

}
