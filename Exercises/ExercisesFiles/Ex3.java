package ExercisesFiles;

import java.io.File;

public class Ex3 {
    public static void main(String[] args) {
        File file = new File("db2","temp");
        File file1 = new File("db2/first.txt");

        System.out.println(file.exists());
        System.out.println(file1.exists());
    }
}
