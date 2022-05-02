package Day4;

interface Drawing{

    void print();
    static void area(){
        System.out.println("Interface Drawing");
    }

}

class Drawing2 implements Drawing{

    @Override
    public void print() {

        System.out.println("Class Drawing2");

    }
}

public class Interface2 {
    public static void main(String[] args) {
        Drawing2 drawing2 = new Drawing2();
        drawing2.print();
        Drawing.area();

    }
}
