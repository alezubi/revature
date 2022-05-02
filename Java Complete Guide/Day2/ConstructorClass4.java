package Day2;

class AddCons{
    public AddCons(){
        System.out.println("First Constructor");
    }
    public AddCons(int a){
        System.out.println("Second Constructor");
    }
    public AddCons(String a){
        System.out.println("Third Constructor");
    }
    public AddCons(String b, int a){
        System.out.println("Four Constructor");
    }
    public AddCons(String a, String b){
        System.out.println("Fifth Constructor");
    }
    public void addMe(){
        System.out.println();

    }

}

public class ConstructorClass4 {
    public static void main(String[] args) {
        AddCons cons1= new AddCons("Hola","Como estas");
        cons1.addMe();

    }
}
