package Day2;

class Constant{
    public void addT(){
        System.out.println("First Constructor");
    }

    public void addT(int a, int b){
        System.out.println("Second Constructor " + (a+b));
    }
    public void addT(String a){
        System.out.println("Third Constructor");

    }
    public void addT(String a, String b){
        System.out.println("Fourth Constructor: " + a + " " + b);
    }
    public void addT(String a, int b){
        System.out.println("Fifth Constructor");
    }
    public void addT(int b, String a){
        System.out.println("Sixth Constructor");
    }
    public void addT(int a ){
        System.out.println("Seventh Constructor");
    }

}

public class ConstructorClass6 {
    public static void main(String[] args) {
        Constant constant = new Constant();
        constant.addT(5, 4);
        constant.addT("Hola","Me llamo Alejandro");

    }
}
