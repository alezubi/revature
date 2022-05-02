package Day5;

interface BankSystem{
    boolean deposit(int a);
    boolean withdraw(int b);
    int getBalance(int a);

}

class SavingAccount implements BankSystem{

    int _balance;
    int _amount;

    @Override
    public boolean deposit(int _amount) {
        _balance = _amount + _balance;
        System.out.println("Successfully deposited: " + _balance + "$");
        return true;
    }

    @Override
    public boolean withdraw(int _amount) {
        _balance = _balance - _amount;
        if (_balance < _amount){
            System.out.println("Insufficient Funds");
            return false;
        } else if (_amount > 5000){
            System.out.println("The amount exceeds the limit");
            return false;
        }else {

            _balance = _balance - _amount;

            System.out.println("Withdraw Succesfull: " + _amount + "$");
            return true;
        }


    }

    @Override
    public int getBalance(int a) {
        this._balance = a;
        System.out.println("Balance: " + _balance + "$");
        return _balance;
    }
}

public class InterfaceReview3 {
    public static void main(String[] args) {

        SavingAccount savingAccount = new SavingAccount();
        savingAccount.deposit(500);
        savingAccount.deposit(600);
        savingAccount.getBalance(savingAccount._balance);
        savingAccount.withdraw(400);
        savingAccount.getBalance(savingAccount._balance);



    }
}
