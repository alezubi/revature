package com.bank.Model;
//Account properties start from here! All variables are declared inside of account which is going to be used later!
//Constructor, setters and getters have been Auto-generated to avoid wasting time coding it (Can be edited if needed)
//toString has been Auto-Generated with the selected variables
//To String (For esthetic purposes it has been edited so the output is better)
public class Account {
	private int account_id;
	private int customer_id;
	private String account_type;
	private double balance;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public Account(int account_id, int customer_id, String account_type, double balance) {
		super();
		this.account_id = account_id;
		this.customer_id = customer_id;
		this.account_type = account_type;
		this.balance = balance;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [account_id=" + account_id + ", customer_id=" + customer_id + ", account_type=" + account_type
				+ ", balance=" + balance + "]";
	}

	
}
