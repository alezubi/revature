package ExercisesDay7;

class NoMoreObjectsException extends Exception{

    NoMoreObjectsException(){
        super("No more OBJECTS ^.^");
    }

}

class Test{

    static int testCounter;

    Test() throws NoMoreObjectsException{

        if(testCounter == 0){

            testCounter++;
        }else {

            throw new NoMoreObjectsException();
        }

    }

}

public class Ex7 {
    public static void main(String[] args) throws NoMoreObjectsException {

        // Test test4 = new Test();
        // Test test5 = new Test(); ONLY ONE CLASS IS ALLOWED (:

        try{
            Test test1 = new Test();
            Test test2 = new Test();
            Test test3 = new Test();
        } catch (NoMoreObjectsException ex){
            System.out.println(ex.getMessage());
            //System.out.println("NO MORE OBJECTS >.<");
        }

    }
}
