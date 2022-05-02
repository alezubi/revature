package Day6;

public class Learning_String_Buffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);

        // append
//        sb.append("World");
//        System.out.println(sb); // HelloWorld

        // insert
//        sb.insert(0, "World");
//        System.out.println(sb);  // WorldHello

        // replace
//        sb.replace(1,3,"World");
//        System.out.println(sb); //HWorldlo

        // delete
//        sb.delete(1,3);
//        System.out.println(sb); // Hlo

        // reverse
        sb.reverse();
        System.out.println(sb);  //olleH
    }
}

