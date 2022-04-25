package ExerciseHashSet;

import java.util.HashSet;

public class Ex4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");
        set.add("G");

        // COMPLETE HASHSET
        System.out.println("Complete HashSet: " + set);

        set.removeAll(set);

        //EMPTY HASHSET
        System.out.println("Empty HashSet: " + set);
    }
}
