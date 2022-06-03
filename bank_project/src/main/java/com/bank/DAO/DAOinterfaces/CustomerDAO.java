package com.bank.DAO.DAOinterfaces;

import com.bank.Exceptions.BusinessException;
import com.bank.Model.Customer;
//Customer Interface created to store the method that we are going to use for Customer
//All methods stored in CustomerDAO however the body can be modified any time when it is implemented
//Methods created (customerVerifyLogin, createCustomer)
public interface CustomerDAO {
		public Customer customerVerifyLogin(String email, String password) throws BusinessException;
		public int createCustomer(Customer customer) throws BusinessException;
}
