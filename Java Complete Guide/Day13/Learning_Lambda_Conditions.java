package Day13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Learning_Lambda_Conditions {
    public static void main(String[] args) {
        List <String> words = Arrays.asList("World",null,null,"Chair","Phone","Hola","Sol");
        System.out.println(words);
        List <String> finalWords = words.stream().filter(word -> word != null).collect(Collectors.toList());
        System.out.println(finalWords);
    }
}
