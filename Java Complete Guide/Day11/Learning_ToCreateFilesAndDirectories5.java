package Day11;

import java.io.File;

public class Learning_ToCreateFilesAndDirectories5 {
    public static void main(String[] args) {
        File file = new File("db2","second.txt");
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());
    }
}
