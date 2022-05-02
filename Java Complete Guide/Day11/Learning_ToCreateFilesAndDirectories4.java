package Day11;

import java.io.File;

public class Learning_ToCreateFilesAndDirectories4 {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("db2");
        String [] list = file.list();

        for (String s : list){
            File file1 = new File(file,s);
            if(file1.isDirectory()){
                count++;
                System.out.println(s);
            }
        }
        System.out.println("Total of Directories: " + count);
    }
}
