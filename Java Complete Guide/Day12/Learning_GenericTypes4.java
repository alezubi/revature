package Day12;

class Employee2{
    String name;

    public <T>  Employee2(T name){
        this.name=name.toString();
    }
    public <T> void getName(T name){
        this.name=name.toString();
        System.out.println(name);
    }
}

public class Learning_GenericTypes4 {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2("Alejandro");
        Employee2 employee21 = new Employee2(123);

        //employee21.getName("Alejandro1"); // Overrides the Value
        //employee2.getName("Hola");//Overrides the Value



    }
}
