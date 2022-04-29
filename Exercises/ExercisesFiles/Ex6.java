package ExercisesFiles;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ex6 {
    public static void main(String[] args) {

        char[] list = new char[20];

        try{
            FileReader fl = new FileReader("src/ExercisesFiles/input.txt");
            BufferedReader br = new BufferedReader(fl);

            br.read(list);
            System.out.println("Data found: ");
            System.out.println(list);

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
