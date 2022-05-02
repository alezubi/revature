package Day9;

import java.util.TreeSet;

public class Learning_TreeSet {
    public static void main(String[] args) {
        // create TreeSet and add elements
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mark");
        treeSet.add("Watson");
        treeSet.add("Paul");
        treeSet.add("Apple");

        System.out.println(treeSet);
        System.out.println();

        for (String name : treeSet) {
            System.out.println(name);
        }
    }
}
