package com.bank.Service;

import com.bank.Exceptions.BusinessException;
//MenuService Interface created to store the method that we are going to use for the Menu
//All methods are stored in MenuService however the body can be modified any time when it is implemented
//Methods created (withdrawAmount,depositAmount,searchBalance)


public interface MenuService {
	public double withdrawAmount(int account_id, double newBalance) throws BusinessException;
	public double depositAmount(int account_id, double newBalance) throws BusinessException;
	public double searchBalance(int account_id) throws BusinessException;
}
