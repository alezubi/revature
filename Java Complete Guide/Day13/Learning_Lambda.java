package Day13;

interface IDisplay{
    String message(String str);
}

public class Learning_Lambda {
    public static void main(String[] args) {

        IDisplay display = (names) -> {
            String str1 = "Hello ";
            String str2 = names;
            String str3 = ", How are you";
            return str1 + str2 + str3;
        };

        System.out.println(display.message("Alejandro")); // = names

    }
}
