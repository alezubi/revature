package Day2;

class VideoGames {
    public String title;
    public String author;
    public int price;
    public double rate;

    public void printVideoGames(String a, String b, int c, double d) {
        this.title=a;
        this.author=b;
        this.price=c;
        this.rate=d;
        System.out.println("Title:" + a);
        System.out.println("Author:" + b);
        System.out.println("Price:" + c + "$");
        System.out.println("Rate:" + d);
        System.out.println("");
    }
}

public class ConstructorClass {
    public static void main(String[] args) {

        VideoGames GameInfo= new VideoGames();

        GameInfo.printVideoGames("Minecraft","Microsoft", 60,4.5);
        GameInfo.printVideoGames("Call of Duty","Ubisoft", 56, 3.5);


    }
}
