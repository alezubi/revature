package Day7;

import java.io.IOException;

public class Learning_Exceptions4 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        try {
            calculator.test();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException thrown");
        } catch (NullPointerException ex) {
            System.out.println("NullpointerException thrown");
        }

    }
}

class Calculator {
    public void test() throws ArithmeticException, NullPointerException, IOException{

    }
}
