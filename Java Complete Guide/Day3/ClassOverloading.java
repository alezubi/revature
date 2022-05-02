package Day3;

import java.util.Scanner;

class Overloading{

int a;
    public static void Test(){
        System.out.println("Insert a number");
        Scanner sc2 = new Scanner(System.in);
        int x = sc2.nextInt();
        System.out.println("Default" + x);
        System.out.println(" ");
    }

    public static void Test(int a){

        System.out.println("Second Method "+ a);
        System.out.println(" ");
    }

    public static void Test(String a){

        System.out.println("Third Method " + a);
        System.out.println(" ");
    }

    public static void Test(int a, String b){
        System.out.println("Four Method " + a + b);
        System.out.println(" ");
    }

    public static void Test(String a, int b){
        System.out.println("Five Method " + a + b);
        System.out.println(" ");
    }


}

public class ClassOverloading {
    public static void main(String[] args) {
        Overloading.Test();
        Overloading.Test(1);
        Overloading.Test("Hola");
        Overloading.Test("Mono",5);
        Overloading.Test(5,"Mono");

    }
}
