package Day3;

import java.util.Scanner;

class Customer{
    public String name;
    public int id;
    public static String company ="Walmart";
    public int price;
    public int amountItems;
    public static String purchase ="Purchase Approved";


    public Customer() {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc1.nextLine();

        Scanner sc2=new Scanner(System.in);
        System.out.println("Enter ID");
        int id = sc2.nextInt();

        System.out.println("Amount of Items");
        Scanner sc4 = new Scanner(System.in);
        int amountItems = sc4.nextInt();

        System.out.println("Enter price");
        Scanner sc3 = new Scanner(System.in);
        int price = sc3.nextInt();

        System.out.println(" ");
        System.out.println("Name: " + name);
        System.out.println("ID " + id);
        System.out.println("Amount of Items: " + amountItems);
        System.out.println("Price: " + price +"$");
        System.out.println("Company: " + company);
    }

    public void printInfo(){

        System.out.println("<" + purchase + ">");
        System.out.println(" ");
    }

}

public class ConstructorClass2 {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.printInfo();

        Customer customer2 = new Customer();
        customer2.printInfo();

    }
}
