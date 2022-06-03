package com.bank.DAO.DAOinterfaces;

import java.util.List;
//Transaction Interface created to store the method that we are going to use for Transaction
//All methods stored in TransactionDAO however the body can be modified any time when it is implemented
//Methods created (createTransaction,getTransactionById)

import com.bank.Exceptions.BusinessException;
import com.bank.Model.Transaction;
public interface TransactionDAO {
	public int createTransaction(Transaction transaction) throws BusinessException;
	public List<Transaction> getTransactionById(int customer_id) throws BusinessException;
}
