package Day9;

import java.util.Iterator;
import java.util.LinkedList;

public class Learning_LinkedListCompleteGuide {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();
        names.add("Paul");
        names.add("Mark");
        names.add("Raul");
        System.out.println(names);
        System.out.println();
        System.out.println("Alejandro added First");
        names.add(0,"Alejandro");
        System.out.println(names);
        System.out.println();

        LinkedList<String> newNames = new LinkedList<>();
        newNames.add("Stacy");
        newNames.add("Isabella");
        System.out.println("Stacy and Isabella added");



        names.addAll(newNames);
        System.out.println(names);
        System.out.println();

        names.addFirst("First");
        System.out.println("All names added to first");
        System.out.println(names);
        System.out.println();

        System.out.println();

        names.addLast("Last");

        // LinkedList methods:
        // remove()
        // removeFirst()
        // removeLast()
        // removeFirstOccurrence()
        // removeLastOccurrence()

        names.add("Paul");
        names.add("Raul");
        System.out.println("Raul and Paul added to Last");
        System.out.println(names);
        System.out.println();

        names.removeLastOccurrence("Paul");
        names.removeFirstOccurrence("Raul");
        System.out.println("Paul remove from Last, Raul removed from First");
        System.out.println(names);
        System.out.println();

        Iterator iterator = names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        for(int i = names.size() - 1; i >= 0; i--){
            System.out.println(names.get(i));    //REVERSE

        }




    }
}
