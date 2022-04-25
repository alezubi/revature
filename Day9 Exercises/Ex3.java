package ExercisesDay9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();
        students.add("Alejandro");
        students.add("Uribe");
        students.add("Finamore");
        students.add("Isabella");
        students.add("Luciana");
        students.add("Moises");

        //Normal output
        System.out.println(students);

        System.out.println("-----------------------------");

        // From Index 3

        Iterator iterator = students.listIterator(3);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }











    }


}

