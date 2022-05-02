package Day3;

class Welcome{

    public void getWelcome(String a){
        System.out.println("Welcome " + a);
    }

        }
class Welcome2 extends Welcome{

    public void getWelcome(String a){
        System.out.println("Hola " + a);

    }




}


public class Inheritance_Overriding4 {
    public static void main(String[] args) {
        Welcome2 welcome2 = new Welcome2();
        welcome2.getWelcome("Ramon");

    }
}
