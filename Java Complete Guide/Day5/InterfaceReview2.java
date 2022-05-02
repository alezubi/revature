package Day5;

interface Speed{
    boolean speedUp(int a);
    boolean applyBrakes(int a);
}
class CarSpeed implements Speed{

    int speed;

    @Override
    public boolean speedUp(int increment) {
        speed = increment + speed;

        return true;
    }

    @Override
    public boolean applyBrakes(int decrement) {
        speed =  speed - decrement;
        return true;

    }
    public void printSpeed(){
        System.out.println("The actual speed is " + speed + " MPH");
    }
}

public class InterfaceReview2 {
    public static void main(String[] args) {
        CarSpeed carSpeed = new CarSpeed();
        carSpeed.speedUp(5);
        carSpeed.speedUp(10);
        carSpeed.applyBrakes(2);
        carSpeed.printSpeed();

    }
}
