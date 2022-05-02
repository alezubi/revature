package Day13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Learning_Lambda_FilterExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30,35,40);
        List<Integer> evenNumbers = new ArrayList<>();

        for (int number : numbers){
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);

        evenNumbers = numbers.stream().filter((number) -> number % 2 == 0 ).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }


}
