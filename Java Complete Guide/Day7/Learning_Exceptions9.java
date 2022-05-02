package Day7;

public class Learning_Exceptions9 {
    public static void main(String[] args) {

        try{

        }catch (ArithmeticException ex){

        }

        try{
            try{

            }catch (NullPointerException ex){

            }
        }catch (IndexOutOfBoundsException | NullPointerException  | StackOverflowError ex) {

        }

        try{

        }catch (NullPointerException ex){

        }catch (Exception ex){

        }

        try{

        }finally {
            System.out.println("It is over");
        }



    }
}
