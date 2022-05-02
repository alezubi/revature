package Day12;

class Test{
    <E> void printArray(E[] elements){
        for(E element: elements){
            System.out.println(element);
        }
    }
}

public class Learning_GenericTypes3 {
    public static void main(String[] args) {
        Test test = new Test();
        Integer[] intArray = {1,2,3,4,5,6,7};
        Character[] charArray = {'A','B','C','D','E'};
        test.printArray(intArray);
        System.out.println("********************");
        test.printArray(charArray);

    }
}
