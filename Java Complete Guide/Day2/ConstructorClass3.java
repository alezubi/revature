package Day2;

class Calculation{
   public int a=5;
   public int b=10;
    public Calculation(){
        System.out.println("Result:"+ (a+b));
    }

    public Calculation(int x,int y){
        this.a=x;
        this.b=y;

    }

    public void Answer() {
        System.out.println(a+b);
    }
}

public class ConstructorClass3 {
    public static void main(String[] args) {
        Calculation calculation1= new Calculation(400,200);
        calculation1.b = 45;
        calculation1.a = 50;
        calculation1.Answer();


    }
}
