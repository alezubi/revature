package Day7;

import java.util.Scanner;

public class Learning_TryAndCatch {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;


        System.out.println("Enter your first input: ");
        Scanner sc1 = new Scanner(System.in);
        int d = sc1.nextInt(a);


        System.out.println("Enter your second input: ");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt(b);


        try {
            c = a / b;
        } catch (ArithmeticException ex) {

            System.out.println("Invalid Number");

        } catch (Exception ex) {
            System.out.println("Siuuu");
        } finally {
            System.out.println("Finally");
        }


        System.out.println("Result: " + c);
    }
}
