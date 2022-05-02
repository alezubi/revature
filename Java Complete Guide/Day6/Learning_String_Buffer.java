package Day6;

public class Learning_String_Buffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hola Amigos como estan?");
        //sb.append(" World");
        //sb.insert(2,"World");
        //sb.replace(2,3,"Mono");
        //sb.delete(1,3);
        //sb.reverse();
        sb.capacity();
        System.out.println(sb.capacity());



    }
}
