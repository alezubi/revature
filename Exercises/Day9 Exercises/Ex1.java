package ExercisesDay9;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Julio");
        names.add("Ale");
        names.add("Monkey");

        names.set(2,"Monkey is the last String on the list");
        System.out.println(names.get(2));

    }
}
