package Day2;
class Calculator{
    public int num1;
    public int num2;
    public void addNumber() {
        System.out.println("Sum: " + (num1 + num2));
    }

    public void subNumber() {
        System.out.println("Sub: " + (num1 - num2));
    }

    public void mulNumber() {
        System.out.println("Mul: " + (num1 * num2));
    }

    public void divNumber() {
        System.out.println("Div: " + (num1 / num2));
    }
}
public class BC_Classes {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        calculator1.num1 = 200;
        calculator1.num2 = 100;

        calculator1.addNumber();
        calculator1.subNumber();
        calculator1.mulNumber();
        calculator1.divNumber();

        Calculator calculator2 = new Calculator();
        calculator2.num1 = 500;
        calculator2.num2 = 250;

        calculator2.addNumber();
        calculator2.subNumber();

    }
}
