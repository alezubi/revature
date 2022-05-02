package Day7;

public class Learning_Exceptions6 {
    public static void main(String[] args) {
        String str = "Mark";
        System.out.println(str.length());
        String str2 = null;

        try{
            System.out.println(str2.length());
        } catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }

        Costumer costumer = new Costumer();
        costumer.printD();

        Costumer costumer1 = null;

        try{
            costumer1.printD();
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        } catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }



    }
}

class Costumer{
    public void printD(){
        System.out.println("DISPLAYING....");

    }
}
