package Day13;

interface DrawSomething{
    void draw();
}

class Output implements DrawSomething{

    @Override
    public void draw() {
        System.out.println("Drawing....");
    }
}


public class Learning_Lambda2 {
    public static void main(String[] args) {
        Output output = new Output();
        output.draw();

        DrawSomething drawSomething = new DrawSomething() {
            @Override
            public void draw() {
                System.out.println("Drawing....");
            }
        };

       drawSomething.draw();

       DrawSomething drawSomething1 = () ->{
           System.out.println("Lambda is Drawing...");
       };
       drawSomething1.draw();

       DrawSomething drawSomething2 = () ->{
           System.out.println("Lambda is getting crazy");

       };
       drawSomething2.draw();

    }
}
