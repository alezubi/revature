package ExercisesFiles;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        new Ex8().getLongestWord();

    }
    public String getLongestWord(){
        String longestWord = "";
        String currentWord;
        Scanner sc = new Scanner("input.txt");
        while (sc.hasNext()){
            currentWord =  sc.next();
            if(currentWord.length() > longestWord.length()){
                longestWord = currentWord;
            }
        }

        System.out.println(longestWord);
        return longestWord;

    }
}
