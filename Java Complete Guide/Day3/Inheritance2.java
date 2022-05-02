package Day3;

class Parent {

    public Parent(int a, String name, int id, String status) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + a);
        System.out.println("ID: " + id);
        System.out.println("Status: " + status);


        System.out.println(" ");


    }


}

class Child extends Parent{
    public Child(int x, String name, int id, String status){
        super(x,name,id,status);

    }
}

public class Inheritance2 {
    public static void main(String[] args) {

        Parent parent = new Parent(30,"Eduardo", 456, "Parent");
        Child child = new Child(10,"Moises", 342, "Child");

    }
}
