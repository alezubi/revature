package Day11;

import java.io.File;
import java.io.IOException;

public class Learning_ToCreateFilesAndDirectories6 {
    public static void main(String[] args) {
        File file = new File("db2","second.txt");
        System.out.println(file.exists());
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File Created: " + file);
    }
}
