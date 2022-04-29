package Day11;

import java.util.Scanner;

class Bank {
    int balance = 0;

    synchronized void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("Insufficient Balance");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

         balance -= amount;

        System.out.println("Successfully withdraw: " + amount + "$");
        System.out.println("Balance: " + balance + "$");
        notify();

    }

    synchronized void deposit(int amount){

        System.out.println("Processing deposit...");
        balance += amount;
        System.out.println("Deposit Completed: " + amount + "$");
        System.out.println("Balance: " + balance + "$");
        notify();

    }

    synchronized void afterMessagePrint(String message){

        //System.out.println("Do you want to perform another action? Press 1 for deposit, Press 2 for withdraw, Press 0 if you are done for today");

        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(message);

        //System.out.println("Do you want to perform another action? Press 1 for deposit, Press 2 for withdraw, Press 0 if you are done for today");



    }

}

class withdrawThread extends Thread{
    Bank bank;

    public withdrawThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
       bank.withdraw(5000);
    }
}

class depositThread extends Thread{
    Bank bank;

    public depositThread(Bank bank){
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(10000);
    }
}

class afterMessageThread extends Thread{
    Bank bank;
    afterMessageThread(Bank bank){
        this.bank=bank;
    }

    @Override
    public void run() {
        bank.afterMessagePrint("Do you want to perform another action? Press 1 for deposit, Press 2 for withdraw, Press 0 if you are done for today");
    }

}




public class BankSystem_Threads {
    public static void main(String[] args) {
        Bank bank = new Bank();
        withdrawThread withdraw = new withdrawThread(bank);
        depositThread deposit = new depositThread(bank);
        afterMessageThread message = new afterMessageThread(bank);


        withdraw.start();
        deposit.start();
        message.start();


        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1){

            System.out.println("Enter your amount");
            Scanner sc1 = new Scanner(System.in);
            int deposit1 = sc1.nextInt();


            bank.deposit(deposit1);


        } else if (answer == 2){

            System.out.println("Enter your amount");
            Scanner sc2 = new Scanner(System.in);
            int withdraw1 = sc2.nextInt();

            bank.withdraw(withdraw1);


        } else {
            System.out.println("You are done for today!");
        }

    }
}
