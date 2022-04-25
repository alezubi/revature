package ExercisesDay9;

import java.util.ArrayList;
import java.util.Collections;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);



        //Normal Order
        System.out.println(numbers);

        //Reverse Order
        Collections.reverse(numbers);
        System.out.println(numbers);

     }
}
