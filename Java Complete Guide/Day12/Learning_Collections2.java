package Day12;

import java.util.ArrayList;
import java.util.Collections;

public class Learning_Collections2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");
        names.add("Moises");
        names.add("Isa");

        System.out.println("Before Sorting...");
        for (String name: names){
            System.out.println(name);
        }

        Collections.sort(names);

        System.out.println("After Sorting...");
        for (String name: names){
            System.out.println(name);
        }
    }
}
