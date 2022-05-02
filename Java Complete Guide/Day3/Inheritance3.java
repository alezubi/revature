package Day3;

class Car1{
    public final int speedLimit=60;

    public void getSpeedLimit(){
        System.out.println("You are driving a vehicle and this is the speed limit:" + speedLimit);
        System.out.println(" ");
    }
}
class Car2 extends Car1{
    public void getSpeedLimit(){
        System.out.println("There is no speed limit");
        System.out.println(" ");
    }

    public void Warning(){
        System.out.println("Cop: You are over the speed limit stop it");

    }

}
public class Inheritance3 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.getSpeedLimit();

        Car2 car2 = new Car2();
        car2.getSpeedLimit();
        car2.Warning();

    }
}
