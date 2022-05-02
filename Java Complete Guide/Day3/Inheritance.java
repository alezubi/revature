package Day3;

import java.util.Scanner;

class SchoolNames{
    public String firstName;
    public String lastName;
    public int age;
    public String race;
    public int id;


    public void getFullName(){
        Scanner scanner= new Scanner(System.in);
        firstName= scanner.nextLine();

        System.out.println("Full Name: " + firstName + " " + lastName);
    }
    public void getAge(){

        System.out.println("Age: " + age);

    }
    public void getRace(){
        System.out.println("Race: " + race);
    }
    public void getID(){
        System.out.println("ID: "+ id);
    }

}

class Student extends SchoolNames{
    public void getFullInformation(){
        System.out.println("Status: Student");
        System.out.println(" ");
    }
}

class Professor extends SchoolNames{
    public void getFullInformation(){
        System.out.println("Status: Professor");
        System.out.println(" ");
    }
}

public class Demo2 {
    public static void main(String[] args) {

        Professor professor = new Professor();

        professor.lastName = "Uribe";
        professor.age = 30;
        professor.race = "White";
        professor.id = 496;
        professor.getFullName();
        professor.getAge();
        professor.getRace();
        professor.getID();
        professor.getFullInformation();

        Student student = new Student();
        student.lastName = "Zubi";
        student.race = "Hispanic";
        student.age = 18;
        student.id = 385;
        student.getFullName();
        student.getAge();
        student.getRace();
        student.getID();
        student.getFullInformation();
    }
}
