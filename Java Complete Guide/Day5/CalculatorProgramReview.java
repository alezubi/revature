package Day5;

class Calculator{

    public int a;
    public int b;

    public void addCalculator(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Sum: " + (a + b));

    }

    public void subCalculator(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Sub: " + (a - b));

    }
    public void mulCalculator(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Mul : " + ( a * b));
    }
    public void DivCalculator(int a, int b){
        System.out.println("Div : " + (a / b));
    }

}
class BabyCalculator extends Calculator{

    int a;
    int b;
    int c;

    public void addCalculatorBaby(int a, int b, int c){

        System.out.println("3 int SUM: " + (a + b + c));

    }

}

public class CalculatorProgramReview {
    public static void main(String[] args) {
        BabyCalculator babyCalculator = new BabyCalculator();
        babyCalculator.addCalculator(10,2);
        babyCalculator.subCalculator(10,2);
        babyCalculator.mulCalculator(10,2);
        babyCalculator.DivCalculator(10,2);

        babyCalculator.addCalculatorBaby(5,3,5);


    }
}
