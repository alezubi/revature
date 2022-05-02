package Day7;
class InsufficientFundException extends Exception{

    public InsufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundException(String message){
        super(message);
        System.out.println("You are not able to withdraw that amount");
    }

}

class BankAccount{
    private int _balance;
    private int accountNumber;


    public BankAccount(int amount){

    }

    public void deposit(int amount){
        _balance += amount;
        System.out.println("Deposited Amount: " + amount + "$");
    }

    public boolean withdraw(int amount) throws InsufficientFundException {
        if(amount <= _balance) {
            _balance -= amount;
            System.out.println("Withdrawn Amount: " + amount + "$");
            return true;
        }else {
            throw new InsufficientFundException("This is invalid request");
        }
    }

    public int getBalance(){
        System.out.println("Balance: " + _balance + "$");
        return _balance;
    }

}

public class Learning_Exceptions {
    public static void main(String[] args) throws InsufficientFundException {
        BankAccount bankAccount = new BankAccount(334466);
        bankAccount.deposit(5000);
        bankAccount.withdraw(5000);



        try {
            bankAccount.withdraw(5000);
        } catch (InsufficientFundException exception) {

            System.out.println("No enough funds");
        }

        bankAccount.getBalance();

    }
}
