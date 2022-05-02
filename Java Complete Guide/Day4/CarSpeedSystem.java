package Day4;

interface Speed{
    boolean changeGear(int a);
    boolean speedUp(int a);
    boolean applyBrakes(int a);

}

class CarSpeed implements Speed {

    int gear;
    int speed;

    @Override
    public boolean changeGear(int newGear) {

        gear = newGear;

        return true;
    }

    @Override
    public boolean speedUp(int increment) {

        speed = speed + increment;

        return true;

    }

    @Override
    public boolean applyBrakes(int decrement) {

        speed = speed - decrement;

        return true;
    }
    public void printSpeed() {
        System.out.println("speed: " + speed
                + " gear: " + gear);
    }
}

public class CarSpeedSystem {
    public static void main(String[] args) {
     CarSpeed carSpeed = new CarSpeed();
     carSpeed.speedUp(1);
     carSpeed.speedUp(1);
     carSpeed.changeGear(2);
     carSpeed.applyBrakes(1);
     carSpeed.speedUp(2);
     carSpeed.printSpeed();

    }
}
