package Day7;

public class Learning_Exceptions8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        try{
            c = a / b;
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch (NullPointerException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
