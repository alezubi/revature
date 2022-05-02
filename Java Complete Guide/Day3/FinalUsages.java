package Day3;

class Bike{
public final void drive(){
        System.out.println("driving...");
        }
        }

class Honda extends Bike{
//    @Override
//    public void drive() {
//        System.out.println("not driving...");
//    }
}

public class FinalUsages {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.drive();

    }
}
