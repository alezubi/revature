package Day8;

import java.util.ArrayList;
import java.util.Collections;

public class Learning_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("White");

        //before sorting
        for (String color : colors){
            System.out.println( color);
        }
        System.out.println();
        System.out.println("Sorting");
        System.out.println();

        //after sorting
        Collections.sort(colors);
        for (String color: colors){
            System.out.println(color);
        }


        ArrayList<String> animals = new ArrayList<>();

        animals.add("Monkey");
        animals.add("Giraffe");
        animals.add("Elefant");
        animals.add("Snake");

        System.out.println();



        //before sorting

        for (String animal: animals){
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Sorting");
        System.out.println();

        //after sorting
        Collections.sort(animals);
        for (String animal: animals){
            System.out.println(animal);
        }
        System.out.println();
        System.out.println("Reverse and Sorting");
        System.out.println();

        //reverse, sorting
        Collections.sort(animals);
        Collections.reverse(animals);
        for (String animal: animals){
            System.out.println(animal);
        }

    }
}
