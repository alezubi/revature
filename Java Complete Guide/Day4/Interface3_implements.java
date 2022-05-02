package Day4;

interface I1{
    void print();
}
interface I2 extends I1{
    void print2();
}
class I3 implements I1, I2{

    @Override
    public void print() {

    }

    @Override
    public void print2() {

    }
}

public class Interface3_implements {
    public static void main(String[] args) {


        I3 i3 = new I3();
        i3.print();
        i3.print2();


    }
}
