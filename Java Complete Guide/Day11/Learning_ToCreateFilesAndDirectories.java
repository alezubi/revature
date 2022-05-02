package Day11;

import java.io.File;

public class Learning_ToCreateFilesAndDirectories {
    public static void main(String[] args) {
        File file = new File("db");
        System.out.println(file.exists());
        file.mkdir();
        System.out.println(file.exists());
    }
}
