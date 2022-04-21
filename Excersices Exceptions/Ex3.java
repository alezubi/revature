package ExercisesDay7;

class IncorrectException extends Exception{
    IncorrectException(){
        super("This is Incorrect >.<");
    }
}

public class Ex3 {
    public static void main(String[] args) throws Exception {

        int a = 20;
        int b = 30;
        int c = 55;

       if (c == (a+b)){

           System.out.println("This is Right (:");


        }else {

           try {

              throw new IncorrectException();

           }catch (IncorrectException ex){
               System.out.println(ex.getMessage());}
       }
    }


}
