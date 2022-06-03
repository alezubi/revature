package com.bank.DAO.DAOimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bank.DAO.DAOinterfaces.AccountDAO;
import com.bank.DAO.MyJDBC.PostgresSqlConnection;
import com.bank.Exceptions.BusinessException;
import com.bank.Model.Account;
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
//Used a local variable to stored the data in the first case scenario is int c
//In some cases had to used ResultSet which is a Java object that contains the results of executing an SQL query
//To iterate ResultSet was used its next() method
//When it returns true if the ResultSet has a next record, and moves the ResultSet to point to the next record.
//All the variables or objects inside of the constructors or methods are going to replace that variable value
public class AccountDAOImpl implements AccountDAO{

	@Override
	public int createAccount(Account account) throws BusinessException {

		int c = 0;
		try (Connection connection = PostgresSqlConnection.getConnection()){	
			String sql = "insert into bank.account(account_id, customer_id, account_type, balance) VALUES(?, ?, ?, ?)";	
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, account.getAccount_id());
			preparedStatement.setInt(2, account.getCustomer_id());
			preparedStatement.setString(3, account.getAccount_type());
			preparedStatement.setDouble(4, account.getBalance());
			c = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occurred contact ADMIN");
		}
		return c;
		 
	}

	@Override
	public int withdrawFromAccount(int account_id, double newBalance) throws BusinessException {
		
		int w = 0;
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "update bank.account set balance=? where account_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, newBalance);
			preparedStatement.setInt(2, account_id);
			w = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occurred contact ADMIN");
		}
		return w;
	}
	
	@Override
	public int depositToAccount(int account_id, double newBalance) throws BusinessException {
		int d = 0;
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "update bank.account set balance=? where account_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setDouble(1, newBalance);
			preparedStatement.setInt(2, account_id);
			d = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occurred contact ADMIN");
		}
		return d;
	}

	@Override
	public Account checkBalance(int account_id) throws BusinessException {
		Account account = null;	
		try(Connection connection = PostgresSqlConnection.getConnection()){
			String sql = "select * from bank.account where account_id =?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1,account_id);			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				account = new Account(); 
				account.setAccount_id(resultSet.getInt("account_id"));
				account.setCustomer_id(resultSet.getInt("customer_id"));
				account.setAccount_type(resultSet.getString("account_type"));
				account.setBalance(resultSet.getDouble("balance"));		
			}else {
				throw new BusinessException("No account found with id: "+ account_id);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occurred contact ADMIN");
		}
		return account;
		 
	}
	
	

}
