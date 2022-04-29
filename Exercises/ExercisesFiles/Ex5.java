package ExercisesFiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) throws IOException {
       BufferedReader Reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input: ");
        String R = Reader.readLine();
        System.out.println("Output: " + Reader);

    }
}
