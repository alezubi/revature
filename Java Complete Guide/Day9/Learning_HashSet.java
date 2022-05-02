package Day9;

import java.util.HashSet;
import java.util.Iterator;

public class Learning_HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Mark");
        set.add("Paul");
        set.add("Watson");
        set.add("Mark"); // will be ignored because it has to be unique
        set.add(null);
        set.add(null); // will be ignored

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.remove("Paul");
        System.out.println(set);
    }
}
