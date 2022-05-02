package Day9;

import java.util.Iterator;
import java.util.LinkedList;

public class Learning_LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Mark");
        names.add("Paul");
        names.add("Watson");
        System.out.println(names);

        // adding elements at specified position
        names.add(0, "John");
        System.out.println(names);

        // second list
        LinkedList<String> newNames = new LinkedList<>();
        newNames.add("Rangel");
        newNames.add("Stacy");

        names.addAll(newNames);
        System.out.println(names);

        // addFirst()
        names.addFirst("First");
        System.out.println(names);

        // addLast()
        names.addLast("Last");
        System.out.println(names);

        // LinkedList methods:
        // remove()
        // removeFirst()
        // removeLast()
        // removeFirstOccurrence()
        // removeLastOccurrence()

        System.out.println("--------------------");
        names.add("Paul");
        names.add("John");
        System.out.println(names);
        names.removeLastOccurrence("Paul");
        names.removeFirstOccurrence("John");
        System.out.println(names);
        System.out.println("---------------------");
        // reverse elements
        System.out.println("Original");
        System.out.println(names);

        // transversing list elements in reverse order
        Iterator iterator = names.descendingIterator();
        while (iterator.hasNext()) {
            System.out.print(" " + iterator.next());
        }
        System.out.println();

        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.print(" " + names.get(i));
        }
    }
}
