package Day1;


import java.util.Scanner;

public class BC_Conditionals8_switch {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the input with the greatest amount between 25, 78 and 87");
        String amount=(number.nextLine());
        switch (amount) {
            case "87":
                System.out.println("This is the greatest value");
                break;
            case "78":
                System.out.println("This is the second greatest value");
                break;
            default:
                System.out.println("This is not the greatest value");
        }
    }
}
