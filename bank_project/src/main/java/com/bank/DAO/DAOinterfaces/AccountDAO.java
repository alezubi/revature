package com.bank.DAO.DAOinterfaces;

import com.bank.Exceptions.BusinessException;
import com.bank.Model.Account;
//Account Interface created to store the method that we are going to use for Account
//All methods stored in AccountDAO however the body can be modified any time when it is implemented
//Methods created (createAccount , withdrawFromAccount, depositToAccount, checkBalance
public interface AccountDAO {
		public int createAccount(Account account) throws BusinessException;
		public int withdrawFromAccount(int account_id, double newBalance) throws BusinessException;
		public int depositToAccount(int account_id, double newBalance) throws BusinessException;
		public Account checkBalance(int account_id) throws BusinessException;
}
