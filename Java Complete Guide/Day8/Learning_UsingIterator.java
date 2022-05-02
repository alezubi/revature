package Day8;

import java.util.ArrayList;
import java.util.Iterator;

public class Learning_UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ale");
        names.add("Moi");
        names.add("Isa");

        Iterator iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (String name: names){
            System.out.println(name);
        }

        for (int i=0; i < names.size();i++){
            System.out.println(names);

        }

    }
}
