package ExercisesFiles;

import java.io.*;

public class Ex7 {
    public static void main(String[] args) {
        String fileLines = "";
        BufferedReader br = null;

        try{
            LineNumberReader lnb = new LineNumberReader(new InputStreamReader(new FileInputStream("src/ExercisesFiles/input.txt")));
            while(((fileLines = lnb.readLine()) != null) && lnb.getLineNumber() <= 3){

                System.out.println(fileLines);

            }


        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }  catch (Exception e) {
            System.out.println("File not accessible");
        }
    }
}
