package ExerciseTreeSet;

import java.util.TreeSet;

public class Ex3 {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");


        TreeSet<String> colors2 = new TreeSet<>();
        colors2.add("Yellow");
        colors2.add("Pink ");
        colors2.add("Purple");

        colors.addAll(colors2);

        System.out.println(colors);

    }
}
