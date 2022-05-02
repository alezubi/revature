package Day4;

abstract class Calculation{

    public void addNumber(int a, int b){
        System.out.println("Sum: " + ( a + b ));
    }

    public void subNumber(int a, int b){
        System.out.println("Sub: " + ( a - b ));
    }

    public abstract void mulNumber(int a, int b);
    public abstract void divNumber(int a, int b);

}
class Output extends Calculation{

    @Override
    public void mulNumber(int a, int b) {
        System.out.println("Mul:" + ( a * b));
    }

    @Override
    public void divNumber(int a, int b) {
        System.out.println("Div:" + ( a % b));
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Output output = new Output();
        output.divNumber(2,5);
        output.mulNumber(6,7);
        output.addNumber(8,3);
        output.subNumber(8,4);

    }

}
