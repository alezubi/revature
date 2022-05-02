package Day4;

interface IN{
    void print();
    interface IN2 extends IN{
        void print2();
        interface IN3 extends IN2{
            void print3();

        }
    }
}

class IN4 implements IN.IN2.IN3 {


    @Override
    public void print() {
        System.out.println("IN");

    }

    @Override
    public void print2() {
        System.out.println("IN2");

    }

    @Override
    public void print3() {
        System.out.println("IN3");

    }
}
public class Interface4_implements {
    public static void main(String[] args) {
        IN4 in4 = new IN4();
        in4.print();
        in4.print2();
        in4.print3();


    }
}
