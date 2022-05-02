package Day2;

import java.util.Scanner;
//NOT DONE
public class Conditionals_Scanner5 {
    private static Scanner sc;
    public static void main(String[] args) {
        int number;

        sc = new Scanner(System.in);

        System.out.print(" Please enter the number you would like to multiply: ");

        number = sc.nextInt();

        for (int n=1; n<=10; n++){

            System.out.println(number + " x " + n + " = " + number * n);
        }

    }
}
