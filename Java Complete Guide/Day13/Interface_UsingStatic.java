package Day13;

public class Interface_UsingStatic {
    public static void main(String[] args) {
        Circle2 obj = new Circle2();
        obj.draw();
        Drawable2.print();
    }
}
class Circle2 implements Drawable2{
    @Override
    public void draw() {

    }
}

interface Drawable2 {
    void draw();
    static void print(){ // can't be override
        System.out.println("printing...");
    }
}
