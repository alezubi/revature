package ExerciseHashSet;

import java.util.HashSet;

public class Ex3 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        System.out.println("This is my HashSet: " + set);
        System.out.println("This is my HashSet siez: " + set.size());
    }
}
