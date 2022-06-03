package com.bank.Model;

import java.util.Date;

//Employee properties start from here! All variables are declared inside of employee which is going to be used later!
//Constructor, setters and getters have been Auto-generated to avoid wasting time coding it (Can be edited if needed)
//toString has been Auto-Generated with the selected variables
//Public Transaction Constructor with transaction id for auto increment setted up in the database
//

public class Transaction {
	private int transaction_id;
	private int account_id;
	private Date date;
	private String description;
	private String type;
	private double amount;
	private double balance;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transaction_id, int account_id, Date date, String description, String type, double amount,
			double balance) {
		super();
		this.transaction_id = transaction_id;
		this.account_id = account_id;
		this.date = date;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}
	
	//with transaction id for auto increment
	public Transaction(int account_id, Date date, String description, String type, double amount,
			double balance) {
		super();
		this.account_id = account_id;
		this.date = date;
		this.description = description;
		this.type = type;
		this.amount = amount;
		this.balance = balance;
	}

	public int getTransaction_id() {
		return transaction_id;
	}

	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}

	public int getAccount_id() {
		return account_id;
	}

	public void setAccount_id(int account_id) {
		this.account_id = account_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Transaction [transaction_id=" + transaction_id + ", account_id=" + account_id + ", date=" + date
				+ ", description=" + description + ", type=" + type + ", amount=" + amount + ", balance=" + balance
				+ "]";
	}
	
}
