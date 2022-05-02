package Day11;

import java.io.File;
import java.io.IOException;

public class Learning_ToCreateFilesAndDirectories2 {
    public static void main(String[] args) {
        File dir = new File("db2");
        File file = new File("db2","first.txt");
        File file1 = new File("db2","second.txt");
        File dir2 = new File("db2","temp");
        dir2.mkdir();

        dir.mkdir();

        try {
            file.createNewFile();
            file1.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
