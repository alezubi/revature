package Day3;

class Calculation{

    public int sum(int x, int y){

        return (x + y);

    }

    public int sum(int x, int y, int z) {
        return ( x + y + z);
    }
}

class Calculation2 extends Calculation{
@Override
    public int sum(int x, int y){
        return (x + y);}
    public int sum(int x, int y, int z) {
        return ( x + y + z);}

}


public class Inheritance_Overriding {
    public static void main(String[] args) {

        Calculation calculation = new Calculation();

        System.out.println(calculation.sum(2,4));
        System.out.println(calculation.sum(5,4,3));

    }
}
