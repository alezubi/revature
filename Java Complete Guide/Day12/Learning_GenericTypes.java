package Day12;

class Calculator<T>{

    public boolean areEqual(T a, T b){
        return a.equals(b);
    }
}

public class Learning_GenericTypes {
    public static void main(String[] args) {
        Calculator<Integer> calculator = new Calculator<>();

        boolean result = calculator.areEqual(1,1);

        if (result){
            System.out.println("Are equal");
        }else {
            System.out.println("Not equal");
        }




    }
}
