package Day6;

public class Learning_String_Builder {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        StringBuilder stringBuilder = new StringBuilder("Hello");



        for (int i = 0; i < 100000; i ++){

            stringBuilder.append("World");

        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime + "ms"));

        StringBuffer stringBuffer = new StringBuffer("Hello");

        for (int i = 0; i < 100000; i++){
            stringBuilder.append("World");

        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime + "ms"));



    }
}
