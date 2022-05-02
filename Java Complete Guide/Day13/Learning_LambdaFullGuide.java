package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

interface Hello{
    String hello();
}
interface Hello2{
    String hello(String a);
}

interface Calculation1{
    int addSum(int x, int y);
}

public class Learning_LambdaFullGuide {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30,35,40,45,50,55,60);
        List<Integer> evenNumbers = new ArrayList<>();

        evenNumbers = numbers.stream().filter((number)-> number % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        Hello name = () -> "HelloWorld";{
            String result = name.hello();
            System.out.println(result);
        }

        Hello2 name2 = (name3) -> "Hello" + name3;{
            System.out.println(name2.hello("World"));
        }

        Calculation calculation = (x,y)-> x+y;
        System.out.println(calculation.addNumber(100,200));

        Hello hello5 = () -> "Hola Mundo";
        String output = hello5.hello();
        System.out.println(output);

        Hello2 hello7 = (name7) -> "Hola" + name7;
        System.out.println(hello7.hello(" Moco"));

        Calculation1 calculation7 = (x,y) -> x*y;
        System.out.println(calculation7.addSum(5,5));


    }
}
