package Day13;

public class Interface_UsingPrivate {
    public static void main(String[] args) {
        Output2 obj = new Output2();
        obj.draw();
//      obj.print(); // doesn't work

    }
}
class Output2 implements Foo {
    @Override
    public void draw() {

    }
}

interface Foo {
    void draw();

    private void print(){ // can't be access outside of class
        System.out.println("printing");
    }
}
