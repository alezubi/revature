package Day7;

public class Learning_Exceptions5 {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[1]= 1;
        a[2]= 2;
        a[0]= 3;
        System.out.println(a[1]);
        try{
            System.out.println(a[4]);
        }catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }

    }
}
