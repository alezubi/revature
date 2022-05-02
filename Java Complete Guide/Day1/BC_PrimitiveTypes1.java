package Day1;

public class BC_PrimitiveTypes1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        String str1 = "Hello";
        String str2 = "My";
        String str3 = "Friends";
        System.out.println(str1 + str2 + str3);
        System.out.println(str1 + a + b);

        String z = "Ethereum";
        String result = z + " " + a;
        System.out.println(result);

        char u = 'A';
        char i = 'B';
        char o = 'C';
        System.out.println("" + u + i + o);


    }
}
