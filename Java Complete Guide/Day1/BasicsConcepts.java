package Day1;

class Test {
    static int c=10;
   static int x=100;
   public void addNumber(){
       int a=5;
       int b=10;
       System.out.println(a+b);
   }
   public void foo(){
       int d=10;
       int e=10;
       System.out.println(d+e);

   }

}


public class BasicsConcepts {
    public static void main(String[] args){
        Test y= new Test();


        System.out.println("Hello World this is Alejandro");
        int n = 1;
        int nm = 2;
        int result;
        double result2;
        double numb=20.00;
        double num=10.00;
        result = n + nm;
        result2 = numb + num;


        //System.out.println(n+nm);

        System.out.println("int result is equal to n+nm=");

        System.out.println(result);

        System.out.println("double result is equal to n+nm=");

        System.out.println(result2);

        y.addNumber();
        y.foo();

    }
}
