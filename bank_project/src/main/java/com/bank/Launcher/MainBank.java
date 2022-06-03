package com.bank.Launcher;

import java.util.Scanner;
import java.util.logging.Logger;

//import org.apache.log4j.Logger;

import com.bank.Menu.MenuOptions;
import com.bank.Model.Account;
import com.bank.Model.Customer;
import com.bank.Model.Employee;
//MainBank is the launcher of the program
//Used private static Logger log=Logger.getLogger("consoleLog.MainBank"); to stored all the data that goes through MainBank
//This is the class where everything is going to be launch together!
//Logger Created which I used to log messages of the system and application components
//Logger also used to track error reporting and related data in a centralized way
//Everything is stored inside appLogs.log and the setting are inside of log4j.properties
//Log was perfect for this menu since you can easily turn it on or off, and get more or less information
//Used log to print all the messages in the MenuOptions
//Used log for exceptions
public class MainBank {
	
private static Logger log=Logger.getLogger("consoleLog.MainBank");


public static void main(String[] args) {
		MenuOptions menuoptions = new MenuOptions(); //Object created to store data
		Customer customer = null;
		Employee employee = null;
		//Account account = null; NOT NEEDED because account is not going to be used
		//Transaction transaction = null; NOT NEEDED because transaction is not going to be used
		Scanner sc = new Scanner(System.in);
		
		log.info("Welcome to ZubiBank");
		log.info("-----------------------");
		int ch = 0;
		do {
			log.info("\nChoose an Options ( 1, 2, 3, 4)");
			log.info("=======================");
			log.info("1)Login");
			log.info("2)Register");
			log.info("3)Employee Login");
			log.info("4)EXIT");
			log.info("");
			try {
				ch=Integer.parseInt(sc.nextLine()); //This is going to scan the users input
				//Used the parseInt function converts its first argument to a string, parses that string, then returns an integer
			} catch(NumberFormatException e) {}
			
			switch(ch) {
			case 1:
				menuoptions.customerLogin(sc,customer);
				break;
			case 2:
				menuoptions.customerSignUp(sc,customer);
				break;
			case 3:
				menuoptions.employeeLogin(sc, employee);
				break;
			case 4:
				log.info("\nThank You For Visiting ZubiBank, have a nice day!\n");
				break;
			default:
				log.info("\nInvalid Menu Option. Choose from the given Options.\n");
				break;
			}
		} while(ch != 4); //Keep the program running... The only exit is 4
	
	}

}
