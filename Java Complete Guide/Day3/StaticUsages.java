package Day3;

class Test{
    static int a;

    static {
        a = 20;
        System.out.println(a);
    }
    public void display(){
        a = 30;
        System.out.println(a);
    }
}

public class StaticUsages {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();


    }
}
