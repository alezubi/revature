package Day2;

import java.util.Scanner;

public class Conditionals_Scanner {
    private static Scanner sc;
    public static void main(String[] args) {
        int number, i, SumEven = 0;
        sc = new Scanner(System.in); 

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        for(i = 1; i <= number; i++)
        {
            if(i % 2 == 0)
            {
                SumEven = SumEven + i;
            }
        }
        System.out.println("\n The Sum of Even Numbers up to " + number + "  =  " + SumEven);
    }
}
