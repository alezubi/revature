package ExercisesFiles;

import java.io.File;

public class Ex1 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db2");
        String [] list = file.list();

        for(String s : list){

            count++;
        }

        System.out.println("List of files:" + count);

    }
}
