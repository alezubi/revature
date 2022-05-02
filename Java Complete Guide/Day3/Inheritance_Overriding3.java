package Day3;

class Parent3{
public void greeting(String name){
        System.out.println("Welcome "+ name);
        }
        }

class Child3 extends Parent3{
    @Override
    public void greeting(String name) {
        System.out.println("Hello "+ name);
    }
}


public class Inheritance_Overriding3 {
    public static void main(String[] args) {
    Child3 c = new Child3();
    c.greeting("Mark");
}
}
