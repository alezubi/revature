package com.bank.DAO.DAOimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bank.DAO.DAOinterfaces.EmployeeDAO;
import com.bank.DAO.MyJDBC.PostgresSqlConnection;
import com.bank.Exceptions.BusinessException;
import com.bank.Model.Account;
import com.bank.Model.Customer;
import com.bank.Model.Employee;
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
//Used a local variable to stored the data in the first case scenario is Employee employee (Object)
//In some cases had to used ResultSet which is a Java object that contains the results of executing an SQL query
//To iterate ResultSet was used its next() method
//When it returns true if the ResultSet has a next record, and moves the ResultSet to point to the next record.
//All the variables or objects inside of the constructors or methods are going to replace that variable value
public class EmployeeDAOImpl implements EmployeeDAO{

	@Override
	public Employee employeeVerifyLogin(String email, String password) throws BusinessException {
		Employee employee= null;
		
		try ( Connection connection = PostgresSqlConnection.getConnection() ) {
			String sql = "select * from bank.employee where email = ? and password = ?;";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);	
			ResultSet resultSet = preparedStatement.executeQuery();
			if( resultSet.next() ) {
				employee = new Employee();
				employee.setEmployee_id(resultSet.getInt("employee_id"));
				employee.setFirst_name(resultSet.getString("first_name"));
				employee.setLast_name(resultSet.getString("last_name"));
				employee.setEmail(resultSet.getString("email"));
				employee.setPassword(resultSet.getString("password"));	
			}
			else
				throw new BusinessException("Log in Failed, enter a correct email and password");
				
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
		
		return employee;	
	}

	@Override
	public List<Customer> getAllCustomers() throws BusinessException {
		List<Customer> customerList=new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select * from bank.customer";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Customer customer = new Customer();
				customer.setCustomer_id(resultSet.getInt("customer_id"));
				customer.setFirst_name(resultSet.getString("first_name"));
				customer.setLast_name(resultSet.getString("last_name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setAddress(resultSet.getString("address"));
				customer.setPhone(resultSet.getLong("phone"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPassword(resultSet.getString("password"));
				customer.setStatus(resultSet.getString("status"));
				customerList.add(customer);
			} 
			if(customerList.size() == 0)
			{
				throw new BusinessException("No Customer in Chase Bank DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}		
		return customerList  ;
	}
	
	@Override 
	public List<Account> getAllBankAccounts() throws BusinessException {
		List<Account> accountList=new ArrayList<>();
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "select * from bank.account";
			PreparedStatement preparedStatement=connection.prepareStatement(sql); 
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				Account account = new Account();
				account.setAccount_id(resultSet.getInt("account_id"));
				account.setCustomer_id(resultSet.getInt("customer_id"));
				account.setAccount_type(resultSet.getString("account_type"));
				account.setBalance(resultSet.getDouble("balance"));
				accountList.add(account);
			} 
			if(accountList.size() == 0)
			{
				throw new BusinessException("No Customer in Chase Bank DB so far");
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}		
		return accountList  ;
	}

	@Override
	public Customer getCustomerByEmail(String email) throws BusinessException {
		Customer customer = null;	
		try(Connection connection = PostgresSqlConnection.getConnection()){
			String sql = "select * from bank.customer where email =?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,email);			
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				customer = new Customer(); 
				customer.setCustomer_id(resultSet.getInt("customer_id"));
				customer.setFirst_name(resultSet.getString("first_name"));
				customer.setLast_name(resultSet.getString("last_name"));
				customer.setGender(resultSet.getString("gender"));
				customer.setAddress(resultSet.getString("address"));
				customer.setPhone(resultSet.getLong("phone"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPassword(resultSet.getString("password"));
				customer.setStatus(resultSet.getString("status"));	
			}else {
				throw new BusinessException("No customer found with email: "+ email);
			}
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return customer;
	}
	
	@Override
	public int registerCustomer(int customer_id, String statusChange) throws BusinessException {
		int s = 0;
		try (Connection connection = PostgresSqlConnection.getConnection()) {
			String sql = "update bank.customer set status=? where customer_id=?";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, statusChange);
			preparedStatement.setInt(2, customer_id);
			s = preparedStatement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			throw new BusinessException("Internal error occured contact SYSADMIN");
		}
		return s;
	}
	
}
