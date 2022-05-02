package Day6;

public class Learning_CompareTo {
    public static void main(String[] args) {
        String s1 = "Mark";
        String s2 = "Mark";
        String s3 = "Paul";

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s3.compareTo(s1));
        System.out.println(s1.compareToIgnoreCase("MARK"));

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s1);

    }
}
