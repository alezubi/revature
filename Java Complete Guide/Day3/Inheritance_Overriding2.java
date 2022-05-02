package Day3;

class Bank{
    public int getRateOfInterest(){
        return 2;
    }
}

class BankA extends Bank{
    @Override
    public int getRateOfInterest() {
        return 5;
    }
}

class BankB extends Bank{
    @Override
    public int getRateOfInterest() {
        return 6;
    }
}

public class Inheritance_Overriding2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        BankA bankA = new BankA();
        BankB bankB = new BankB();

        System.out.println(bank.getRateOfInterest());
        System.out.println(bankA.getRateOfInterest());
        System.out.println(bankB.getRateOfInterest());
    }
}
