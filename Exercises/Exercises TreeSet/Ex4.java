package ExerciseTreeSet;


import java.util.Iterator;
import java.util.TreeSet;

public class Ex4 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Pink ");
        colors.add("Purple");

        System.out.println("Original Order: " + colors);

        Iterator iterator = colors.descendingIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}
