package Day12;

import java.util.ArrayList;
import java.util.Collections;

public class Learning_Collections {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);

        System.out.println("Before Sorting....");
        for(int number: numbers){
            System.out.println(number);
        }
        Collections.sort(numbers);
        System.out.println("After Sorting....");
        for(int number: numbers){
            System.out.println(number);

        }

    }
}
