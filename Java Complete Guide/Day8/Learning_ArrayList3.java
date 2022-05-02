package Day8;

import java.util.ArrayList;
import java.util.Iterator;

public class Learning_ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ale");
        names.add("Paul");
        names.add("Chana");


        names.set(1,"Isa");

        ArrayList<String> newName = new ArrayList<>();
        newName.add("Diego");
        newName.add("Jorge");

        System.out.println(names);


        names.addAll(newName);

        //names.remove("Diego");

        names.removeIf(name -> name.contains("Diego"));

        Iterator iterator = names.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        names.forEach(name -> System.out.println(names));

    }
}
