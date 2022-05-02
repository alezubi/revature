package Day3;

public class IndexUsages {
    public static void main(String[] args) {
        String message = "Hello World";
        message.indexOf('o'); // 4
        message.indexOf('o', 5);  // 7
        message.indexOf("ll"); // 2
        message.indexOf('d'); // 10
        message.indexOf("l",6); //9

        System.out.println(message.indexOf('o'));
        System.out.println(message.indexOf('o', 5));
        System.out.println(message.indexOf("ll"));
        System.out.println(message.indexOf('d'));
        System.out.println(message.indexOf('l',6));
    }
}
