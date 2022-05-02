package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students implements Comparable<Students> {
    public int rollCall;
    public String name;
    public int age;

    public Students(int rollCall,String name, int age){
        this.age=age;
        this.rollCall=rollCall;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Students:\n" +
                "rollCall:" + rollCall +
                "\nName:" + name + "\n" +
                "Age:" + age + "\n";
    }


    @Override
    public int compareTo(Students o) {
        if(this.rollCall > o.rollCall){
            return 1;
        }else if(this.rollCall < o.rollCall){
            return -1;
        }else
        return 0;
    }
}

class SortByName implements Comparator<Students>{


    @Override
    public int compare(Students o1, Students o2) {

            return o1.name.compareTo(o2.name);
        }

}




public class Learning_Collections4 {
    public static void main(String[] args) {
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students(2,"Isabella",24));
        students.add(new Students(3,"Alejandro",23));
        students.add(new Students(1,"Carlos",22));
        students.add(new Students(4,"Moises",14));


        System.out.println("Before sorting...");
        for(Students student: students){
            System.out.println(student);
        }

        Collections.sort(students);
        System.out.println("Sorted by rollCall: ");
        for(Students student: students){
            System.out.println(student);
        }

        Collections.sort(students, new SortByName());
        System.out.println("Sorted by name:");
        for (Students student: students){
            System.out.println(student);
        }

    }
}
