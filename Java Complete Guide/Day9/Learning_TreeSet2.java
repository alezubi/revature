package Day9;

import java.util.TreeSet;

public class Learning_TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(65);
        set.add(21);
        set.add(11);
        set.add(2);
        set.add(15);

        for (int number : set) {
            System.out.println(number);
        }

        // PollFirst
        // PollLast

        System.out.println("Highest value: " + set.pollLast());
        System.out.println("Lowest value: " + set.pollFirst());
    }
}
