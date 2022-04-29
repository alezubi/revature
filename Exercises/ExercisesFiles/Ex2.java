package ExercisesFiles;

import java.io.File;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db2/temp");
        String [] list = file.list();

        for (String s : list){
                count++;
            }


        System.out.println("Total of files: " + count);

    }
}
