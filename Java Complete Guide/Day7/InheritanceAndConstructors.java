package Day7;

 class VideoGames{

     public String fullName;
     public int price;

}
class VideoGamesInfo extends VideoGames{


    public VideoGamesInfo(String fullName, int price) {
        this.fullName = fullName;
        this.price = price;

    }


    public void getFullInfo(){

         System.out.println("Name: " + fullName);
         System.out.println("Price: " + price);

    }


}

public class InheritanceAndConstructors {
    public static void main(String[] args) {

        VideoGamesInfo GameInfo = new VideoGamesInfo("Fortnite", 60);
        VideoGamesInfo GameInfo1 = new VideoGamesInfo("FIFA", 70);

        GameInfo.getFullInfo();




    }

}
