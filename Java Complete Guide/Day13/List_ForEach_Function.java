package Day13;


import java.util.ArrayList;
import java.util.List;

public class List_ForEach_Function {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Zubi");
        name.add("Moi");
        name.add("Isa");
        name.add("Chana");

        name.forEach(
                (nameOutput) -> System.out.println(name)
        );

    }
}

