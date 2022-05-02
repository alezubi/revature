package Day6;

public class Learning_concat2 {
    public static void main(String[] args) {
        String s1 = " Hola";
        String s2 = " Mono";
        s1 = s1.concat(s2);
        //System.out.println(s1);
        String s3 = new String("Wow");
        String s4 = "!";

        s3 = s1.concat(s3);
        s4 = s4.concat(s3);
        s3 = s3.concat(s4);

        System.out.println(s4);
    }
}
