package Day6;

import java.util.Arrays;

public class Learning_StringSplit {
    public static void main(String[] args) {
        String message = "mark@gmail.com";
        String[] result = message.split("@");
        System.out.println(Arrays.toString(result));
    }
}
