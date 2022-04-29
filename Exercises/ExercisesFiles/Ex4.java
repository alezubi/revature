package ExercisesFiles;

import java.io.File;

public class Ex4 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db2");
        String [] list = file.list();

        for (String s : list){
            File file1 = new File(file,s);
            if(file1.isFile()){
                count++;
            }
        }

        System.out.println("Total of files: " + count);
    }
}
