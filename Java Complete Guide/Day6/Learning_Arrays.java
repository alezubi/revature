package Day6;

class Names{
    public String name;

    public void printNames(){
        System.out.println("Name: " + name);
    }
}

public class Learning_Arrays {
    public static void main(String[] args) {
        String s1 = "Mark";

        char[] chars = {'H','e','l','l','o' };
        String s2 = new String(chars);
        s2 = s2.concat("World");
        System.out.println(s2);

        char[] chars1 = {'M','y','n','a','m','e'};
        String s3 = new String(chars1);
        s3 = s3.concat(" Alejandro");
        System.out.println(s3);
        s2 = s3.concat("Ramon"); //Incorrect!
        System.out.println(s2); // Incorrect!


    }
}
