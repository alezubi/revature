package com.bank.Menu;

import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;

import com.bank.DAO.DAOinterfaces.AccountDAO;
import com.bank.DAO.DAOinterfaces.CustomerDAO;
import com.bank.DAO.DAOinterfaces.EmployeeDAO;
import com.bank.DAO.DAOimplementation.AccountDAOImpl;
import com.bank.DAO.DAOimplementation.CustomerDAOImpl;
import com.bank.DAO.DAOimplementation.EmployeeDAOImpl;
import com.bank.Exceptions.BusinessException;
import com.bank.Model.Account;
import com.bank.Model.Customer;
import com.bank.Model.Employee;
import com.bank.Service.MenuService;
import com.bank.Service.impl.MenuServiceImpl;

//This is the class where everything is going to the placed together!
//Used private static Logger log=Logger.getLogger("consoleLog.MainBank"); to stored all the data that goes through MenuOptions
//Logger Created which I used to log messages of the system and application components
//Logger also used to track error reporting and related data in a centralized way
//Everything is stored inside appLogs.log and the setting are inside of log4j.properties
//Log was perfect for this menu since you can easily turn it on or off, and get more or less information
//Used log to print all the messages in the MenuOptions
//Used log for exceptions
//Used a Scanner inside the methods to avoid creating a local Scanner every time it was needed
//It contains customerLogin, customerMenu, customerSignUp, employeeLogin, employeeMenu() which are the main methods of this program


public class MenuOptions {
	private static Logger log=Logger.getLogger("consoleLog.MenuOptions");
	
	//Customer Login
	public void customerLogin(Scanner sc, Customer customer) {
		String customeremail ="";
		String customerpassword = "";
		
		CustomerDAO login = new CustomerDAOImpl();
		
		log.info("Enter Your Email: ");
		customeremail = sc.nextLine();
		log.info("Enter Your Password: ");
		customerpassword = sc.nextLine();
		
		try {
			Customer c = login.customerVerifyLogin(customeremail, customerpassword);
			log.info("\nWelcome " +c.getFirst_name()+ " here is your info:");
			log.info("\n"+ c.toString());
			customerMenu(); //CustumerMenu Displayed
			if (c!=null) {
				log.info("");
			}
		} catch (BusinessException e) {
			log.error(e.getMessage());
		}
	}
	
	//Customer menu after login
	public static void customerMenu() {
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("\nCustomer Options");
			log.info("=======================");
			log.info("1)Create an Account");
			log.info("2)Withdraw");
			log.info("3)Deposit");
			log.info("4)Check Balance");
			log.info("5)EXIT");
			log.info("");

			try {
				ch=Integer.parseInt(sc.nextLine());
				//Used the parseInt function converts its first argument to a string, parses that string, then returns an integer
			} catch(NumberFormatException e) {}
			
			switch(ch) {
			case 1:
				int account_id, customer_id;
				String account_type;
				double balance;
				
				AccountDAO createAccount = new AccountDAOImpl();
					
				log.info("Enter An Account#: ");
				account_id = Integer.parseInt(sc.nextLine());
				log.info("Enter Your Customer ID: ");
				customer_id = Integer.parseInt(sc.nextLine());
				log.info("Do Want Checking or Savings Account? ");
				account_type = sc.nextLine();
				log.info("Choose an initial Deposit Amount");
				balance = Double.parseDouble(sc.nextLine());
				//Used the parseInt function converts its first argument to a string, parses that string, then returns a double
				//In this case It was already a double however Java only did let me run it like this
				Account c = new Account(account_id, customer_id, account_type, balance);	
				try {
					if(createAccount.createAccount(c)!=0) {
						log.info(account_type + " account created successfully with a balance of " + balance +"\n");
					}
				} catch(BusinessException e) {
					log.error(e.getMessage());
				}
				break;
			case 2:
				double amount;
				//I called Menu Service Fisrt then one of his methonds = new MenuServiceImpl(); which is the interface
				//Same Process was repeated with DAO Implementations to create a new methods from the Interface then the class
				//Creating a new object from 0! Learned in the project
				//AccountDAO serviceWithdrawFromAccount = new AccountDAOImpl();
				//MenuService searchBalance = new MenuServiceImpl();
				MenuService serviceWithdraw = new MenuServiceImpl();
				AccountDAO daoWithdraw = new AccountDAOImpl();
				log.info("Enter An Account#:");
				account_id = Integer.parseInt(sc.nextLine());
				log.info("How much would you like to withdraw");
				amount = Double.parseDouble(sc.nextLine());
				//Used the parseInt function converts its first argument to a string, parses that string, then returns a double
				
				try {
					double depositBalance = serviceWithdraw.withdrawAmount(account_id, amount);
					daoWithdraw.withdrawFromAccount(account_id, depositBalance);
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
		
				break;
			case 3:

				MenuService serviceDeposit = new MenuServiceImpl();
				AccountDAO daoDeposit = new AccountDAOImpl();
				log.info("Enter An Account#:");
				account_id = Integer.parseInt(sc.nextLine());
				// Used the parseInt function converts its first argument to a string, parses that string, then returns an integer
				log.info("How much would you like to deposit");
				amount = Double.parseDouble(sc.nextLine());
				
				try {
					double depositBalance = serviceDeposit.depositAmount(account_id, amount);
					daoDeposit.depositToAccount(account_id, depositBalance);
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
					
				break;		
			case 4:
				AccountDAO checkbalance = new AccountDAOImpl();
				int accountID;
			
				log.info("What is the Account ID? ");
				accountID = Integer.parseInt(sc.nextLine());
				//Used the parseInt function converts its first argument to a string, parses that string, then returns an integer
				
				try {
					Account checkBalanceByAccountID = checkbalance.checkBalance(accountID);
					log.info("\nYour balance is: $"+ checkBalanceByAccountID.getBalance());
					if (checkBalanceByAccountID!=null) {
						log.info("");
					}
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
				 
				break;
			case 5:
				log.info("\nThank You For Visiting Zubi Bank, have a nice day!\n");
				break;
			default:
				log.info("\nInvalid Menu Option. Choose from the given Options.\n");
				break;
			}
		} while(ch != 5);
	
	}
	
	//Customer Registration
	public void customerSignUp(Scanner sc, Customer customer) {
		String first_name, last_name, gender,address,email,password ;
		long phone;
		
		CustomerDAO register = new CustomerDAOImpl();
			
		log.info("Enter Your First Name: ");
		first_name = sc.nextLine();
		log.info("Enter Your Last Name: ");
		last_name = sc.nextLine();
		log.info("Enter Your gender: M or F");
		gender = sc.nextLine();
		log.info("Enter Your Address: ");
		address = sc.nextLine();
		log.info("Enter Your Phone: ");
		phone = Long.parseLong(sc.nextLine());
		log.info("Enter Your Email: ");
		email = sc.nextLine();
		log.info("Enter Your Password: ");
		password = sc.nextLine();
		
		Customer c = new Customer(first_name, last_name,  gender, address, phone, email, password);	
		try {
			if(register.createCustomer(c)!=0) {
				log.info("Registration Successful. Your status is pending until an employee approves you\n");
			}
		} catch(BusinessException e) {
			log.error(e.getMessage());
		}
	
	}

	
	//Employee Sign in
	public void employeeLogin(Scanner sc, Employee employee) {
		String employeeemail ="";
		String employeepassword = "";
		
		EmployeeDAO login = new EmployeeDAOImpl();
		
		log.info("Enter Your Employee Email: ");
		employeeemail = sc.nextLine();
		log.info("Enter Your Password: ");
		employeepassword = sc.nextLine();
		
		try {
			Employee em = login.employeeVerifyLogin(employeeemail, employeepassword);
			log.info("\nWelcome " +em.getFirst_name() + " " + em.getLast_name() +" here are your task for the day");
			employeeMenu();
			if (em!=null) {
				log.info("");
			}
		} catch (BusinessException e) {
			log.error(e.getMessage());
		}
	
	}
	
	//Employee menu after Login
	public static void employeeMenu() {
		EmployeeDAO dao = new EmployeeDAOImpl();
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			log.info("=======================");
			log.info("1)View All Customers");
			log.info("2)View All Bank Accounts");
			log.info("3)Locate Customer By Email");
			log.info("4)Approve customer registration");
			log.info("5)EXIT\n");
			try {
				ch=Integer.parseInt(sc.nextLine());
				//Used the parseInt function converts its first argument to a string, parses that string, then returns an integer
			} catch(NumberFormatException e) {}
			
			switch(ch) {
			case 1:
		  		// get all customers from the list	
				try {
					List<Customer> customerList = dao.getAllCustomers();
					if(customerList!=null && customerList.size()!=0) {
						log.info("\n\nFound " + customerList.size() + " customers in DB.... Printing them all");
						for(Customer c: customerList) {
							log.info(c);
						}
					}
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
		
				break;
			case 2:
		  		// get all customers from the list	
				try {
					List<Account> accountList = dao.getAllBankAccounts();
					if(accountList!=null && accountList.size()!=0) {
						log.info("\n\nFound " + accountList.size() + " bank accounts in DB.... Printing them all");
						for(Account a: accountList) {
							log.info(a);
						}
					}
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
		
				break;
			case 3:
				//search by email
				String email = "";
				
				log.info("Enter The Customer Email You Are Searching: ");
				email = sc.nextLine();
				try {
					Customer customerByEmail = dao.getCustomerByEmail(email);
					log.info("\nCustomer with the email "+email +" was found.");
					log.info("\n"+ customerByEmail.toString());
					if (customerByEmail!=null) {
						log.info("");
					}
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
				break;
			case 4:
				//Register a customer
				int customerIdNum;	
				String pendingStatus;
					
				log.info("Enter Customers Id#: ");
				customerIdNum = Integer.parseInt(sc.nextLine());
				//Used the parseInt function converts its first argument to a string, parses that string, then returns an integer
				log.info("type: active or denied");
				pendingStatus = sc.nextLine();
				
				try {
					dao.registerCustomer(customerIdNum, pendingStatus);
					log.info("Customer Registered");
				} catch (BusinessException e) {
					log.error(e.getMessage());
				}
		
				break;
			case 5:
				log.info("\nThank You For Visiting Zubi Bank, have a nice day!\n");
				break;
			default:
				log.info("\nInvalid Menu Option. Choose from the given Options.\n");
				break;
			}
		} while(ch != 5);
		
	}

	
	
}
