package Day7;

public class Learning_ExceptionsInheritance {
    public static void main(String[] args) throws Exception {

        print1();
    }

    public static void print1() throws Exception {
        print2();
    }
    public static void print2() throws Exception {
        print3();
    }
    public static void print3() throws Exception {
        throw new Exception();
    }
}
