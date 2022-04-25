package ExerciseTreeSet;

import java.util.TreeSet;

public class Ex5 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        System.out.println("TreeSet: " + numbers);

        System.out.println("First: " + numbers.pollFirst());
        System.out.println("Last: " + numbers.pollLast());
    }
}
