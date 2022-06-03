package com.bank.DAO.DAOinterfaces;

import java.util.List;

import com.bank.Model.Account;
import com.bank.Model.Customer;
import com.bank.Exceptions.BusinessException;
import com.bank.Model.Employee;
//Employee Interface created to store the method that we are going to use for Employee
//All methods are stored in EmployeeDAO however the body can be modified any time when it is implemented
//Methods created (employeeVerifyLogin,getAllCustomers,getAllBankAccounts,getCustomerByEmail,registerCustomer)

public interface EmployeeDAO {
	public Employee employeeVerifyLogin(String email, String password) throws BusinessException;
	public List<Customer> getAllCustomers() throws BusinessException;
	public List<Account> getAllBankAccounts() throws BusinessException;
	public Customer getCustomerByEmail(String email) throws BusinessException;
	public int registerCustomer(int account_id, String statusChange) throws BusinessException;
}
