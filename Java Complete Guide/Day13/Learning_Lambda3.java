package Day13;

interface ISayHello {
    String hello();
}
interface ISayHello2 {

    String hello(String str);

}
interface Calculation{
    int addNumber(int a, int b);
}




public class Learning_Lambda3 {
    public static void main(String[] args) {
        ISayHello hi = () -> "Hello World"; {
            String result = hi.hello();
            System.out.println(result);
        }

        ISayHello2 hi2 = (name) -> "Welcome" + name;{
            System.out.println(hi2.hello("Mark"));

        }

        Calculation calculation = (x,y) -> x + y;
        System.out.println(calculation.addNumber(2,3));






    }
}
