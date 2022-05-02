package Day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Learning_Lambda_ShortCuts_Conditions2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Mark","Paul","Alejandro","Isabella","Moises");
        List<String> result = new ArrayList<>();

        result = names.stream().filter(name -> name.length() > 4 && name.length() < 10).collect(Collectors.toList());
        System.out.println(result);

    }
}
