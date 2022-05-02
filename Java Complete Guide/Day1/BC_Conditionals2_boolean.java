package Day1;

public class BC_Conditionals2_boolean {
    public static void main(String[] args) {
        int age = 20;

        String result = age > 18 ? "eligible" : "not eligible";
        System.out.println(result);

        int number = 6;
        String output = (number % 2 == 0) ? "even" : "odd";
        System.out.println(output);

    }
}
