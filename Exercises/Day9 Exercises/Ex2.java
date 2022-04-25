package ExercisesDay9;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Elefant");
        animals.add("Monkey");
        animals.add("Dolphin");
        animals.add("Shark");

        Iterator iterator = animals.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
