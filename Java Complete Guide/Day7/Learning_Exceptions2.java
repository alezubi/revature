package Day7;

public class Learning_Exceptions2 {
    public static void main(String[] args) {
        // case 1: exception not occur
        try {
            int c = 10 / 5;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("case 1: finall called");
        }

        // case 2: exception occur but not handled

//        try {
//            int c = 10 / 0;
//        } finally {
//            System.out.println("case 2: finall called");
//        }

        // case 3: exception occurs but handled
        try {
            int c = 10 / 0;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("case 3: finally called");
        }

    }
}
