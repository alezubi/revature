package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Learning_Lambda_MapExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> finalNumbers = new ArrayList<>();

        for(Integer number : numbers){

            int result = number * 5;
            finalNumbers.add(result);

        }
        System.out.println(finalNumbers);

        List<Integer> finalNumbers2 = numbers.stream().map(number -> number * 5).collect(Collectors.toList());
        System.out.println();
        System.out.println("Every value=" + numbers + "\n"+ "Every value multiplied by 5=" +finalNumbers2);

        List<Integer> finalNumbers3 = numbers.stream().map(number -> number * number).collect(Collectors.toList());
        System.out.println();
        System.out.println("Every value=" + numbers + "\n" + "Square values=" + finalNumbers3);


    }
}
