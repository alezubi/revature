package Day2;

import java.util.Scanner;
//NOT DONE
public class Conditionals_Scanner4 {
    private static Scanner sc;
    public static void main(String[] args) {
        int number, i = 10, SumEven = 0;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        do {
            System.out.println(SumEven + SumEven + i);
            i++;
        } while (i < 20);
        
        System.out.println("\n The Sum of Even Numbers up to " + number + "  =  " + SumEven);
    }
}
