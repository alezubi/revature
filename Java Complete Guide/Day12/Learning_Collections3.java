package Day12;

import java.util.ArrayList;
import java.util.Collections;

class Employees implements Comparable<Employees> {

    public int id;
    public String name;
    public int age;

    public Employees(int id, String name, int age){

        this.id=id;
        this.name=name;
        this.age=age;

    }

    @Override
    public String toString() {
        return "EmployeeInfo:" + "\n" +
                "ID:" + id + "\n" +
                "Name:" + name + "\n" +
                "Age:" + age + "\n";
    }

    @Override
    public int compareTo(Employees o) {
       // if (this.id > o.id) {
//            return 1;
//        } else if (this.id < o.id) {
//            return -1;
//        } else {
//            return 0;
//        }
        return this.name.compareTo(o.name);
    }
}

public class Learning_Collections3 {
    public static void main(String[] args) {
        ArrayList<Employees> employees = new ArrayList<>();
        employees.add(new Employees(1,"Alejandro",23));
        employees.add(new Employees(3,"Isabella",24));
        employees.add(new Employees(2,"Moises",14));
        employees.add(new Employees(4,"Chana",15));

        System.out.println("Before Sorting....");

        for (Employees employee: employees){
            System.out.println(employee);
        }
        System.out.println("After sorting....");

        Collections.sort(employees);

        for (Employees employee: employees){
            System.out.println(employee);
        }



    }
}
