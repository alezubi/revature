package Day9;

import java.util.*;

public class Learning_HashSet2 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hola");
        set.add("Como");
        set.add("Estas");  //It is set by value, so it wont print in order
        set.add("?");

        System.out.println(set);
        System.out.println();

        HashSet<String> set2 = new HashSet<>();
        set2.add("Bien");
        set2.add("Y");
        set2.add("Tu");

        System.out.println(set2);
        System.out.println();

        set.addAll(set2);

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();

        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(3);
        set3.add(5);
        set3.add(8);
        set3.add(0);
        set3.add(1);

        Iterator iterator1 = set3.iterator();

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        TreeSet<String> set4 = new TreeSet<>();
        set4.add("Yellow");
        set4.add("Blue");
        set4.add("Red");






    }
}

