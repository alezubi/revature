package Day11;

import java.io.FileWriter;
import java.io.IOException;

public class Learning_ToCreateFilesAndDirectories7 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("first.txt",true); // To append , "true" , to override leave it as default
        fw.write(1);
        fw.write("\n");
        fw.write("Hola");
        fw.write("\n");
        fw.write(123);
        fw.write("\n");
        fw.write("Todo");
        fw.write("\n");

        char [] c = {'A','B','C'};

        fw.flush();

        fw.write(c);


        fw.close();
    }
}
