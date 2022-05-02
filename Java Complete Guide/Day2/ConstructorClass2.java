package Day2;

class Employees{
    public String Name;
    public String LastName;

    public Employees(String Name, String LastName){
    this.LastName=LastName;
    this.Name=Name;

    }
    public void FullName(){

        System.out.println("Miserable Full Name:" + " " + Name + " " + LastName );

    }

    }

public class ConstructorClass2 {
    public static void main(String[] args) {
        Employees employee1= new Employees("Oso","Mojon" );

        employee1.FullName();

        Employees employee2= new Employees("Fina","Moniu" );

        employee2.FullName();

        Employees employee3= new Employees("Uyibiu","Mamielon" );

        employee3.FullName();

        Employees employee4= new Employees("Xuviu","Yagiun" );

        employee4.FullName();

    }
}
