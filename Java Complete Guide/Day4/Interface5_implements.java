package Day4;

interface BankInfo{
    boolean deposit(int amount);
    boolean withdraw(int amount);
    void getBalance();

}

class Saving_Account implements BankInfo {

    private int _balance;
    private int _limit;

    @Override
    public boolean deposit(int amount) {
        _balance = amount;
        System.out.println("Succesfully Deposited: " + amount + "$");
        return true;
    }

    @Override
    public boolean withdraw(int amount) {
        if (_balance < amount) {
            System.out.println("Insufficient amount");
            return false;
        } else if (_limit + amount > 0) {
            System.out.println("Withdraw attempt failed, you have excceded the 5000$ limit");
            return false;
        } else {
            _balance -= amount;
            System.out.println("Successfull withdraw: " + amount + "$");
            return true;
        }

    }

    @Override
    public void getBalance() {
        System.out.println("Balance: " + _balance + "$");

    }

}

class Checking_Account implements BankInfo {

    private int _balance;
    private int _limit;

    @Override
    public boolean deposit(int amount) {
        _balance = amount;
        System.out.println("Succesfully Deposited: " + amount + "$");
        return true;
    }

    @Override
    public boolean withdraw(int amount) {

        if (_balance < amount) {
            System.out.println("insufficient fund");
            return false;
        } else if (_limit + amount > 5000) {
            System.out.println("Withdraw attempt failed, you have excceded the 5000$ limit");
            return false;
        } else {
            _balance -= amount;
            System.out.println("Successfull withdraw: " + amount + "$");

            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Balance: " + _balance + "$");

    }
}



public class Interface5_implements {
    public static void main(String[] args) {

        SavingAccount IsabellaSavingAccount = new SavingAccount();
        IsabellaSavingAccount.deposit(5000);
        IsabellaSavingAccount.withdraw(1000);
        IsabellaSavingAccount.getBalance();
        Checking_Account Isabellachecking_account = new Checking_Account();
        Isabellachecking_account.deposit(900);




    }

}
