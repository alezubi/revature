package Day4;

interface BankSystem{
    boolean deposit(int amount);
    boolean withdraw(int amount);
    void getBalance();
}
class SavingAccount implements BankSystem {

    private int _balance;
    private int _limit;

    @Override
    public boolean deposit(int amount) {

        _balance += amount;
        System.out.println("Sucessfully deposited: " + amount + "$");

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

class CheckingAccount implements BankSystem{

    private int _balance;
    private int _limit;

    @Override
    public boolean deposit(int amount) {

        _balance += amount;
        System.out.println("Sucessfully deposited: " + amount + "$");

        return true;
    }

    @Override
    public boolean withdraw(int amount) {

        if (_balance < amount) {
            System.out.println("insufficient fund");
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


    public class BankSystem_Interface {
        public static void main(String[] args) {
            SavingAccount savingAccount = new SavingAccount();
            savingAccount.deposit(5000);
            savingAccount.getBalance();
            savingAccount.withdraw(3000);
            savingAccount.getBalance();

            CheckingAccount checkingAccount = new CheckingAccount();
            checkingAccount.deposit(8000);
            checkingAccount.getBalance();
            checkingAccount.withdraw(4000);
            checkingAccount.getBalance();
            checkingAccount.withdraw(10000);
            savingAccount.deposit(10000);
            savingAccount.withdraw(9000);


        }
    }



