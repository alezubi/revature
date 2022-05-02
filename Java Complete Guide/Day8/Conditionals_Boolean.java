package Day8;

public class Conditionals_Boolean {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        if (b1 || b2) {
            System.out.println("foo");
        }
        if (b1 && b2) {
            System.out.println("bar");
        }
        if (!b1) {
            System.out.println("baz");
        } else if (!b2) {
            System.out.println("bat");
        } else {
            System.out.println("zab");
        }
    }
}
