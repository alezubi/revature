package ExercisesDay9;

import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        LinkedList<String> sports = new LinkedList<String>();
        sports.add("Soccer");
        sports.add("Baseball");
        sports.add("Golf");
        sports.add("Football");

        System.out.println("Original List: " + sports);

        Iterator iterator = sports.listIterator();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Index number: ");
        int newIndex = sc.nextInt();

        sports.set(newIndex , "Value Inserted");


        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }


    }
}
