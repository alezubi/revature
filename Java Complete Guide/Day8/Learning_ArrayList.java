package Day8;

import java.util.ArrayList;

public class Learning_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ale");
        names.add("Boby");
        names.add("Icha");

        System.out.println(names.get(1));

        names.set(1,"BobyTo");

        for(String name: names){
            System.out.println(name);
        }

    }
}
