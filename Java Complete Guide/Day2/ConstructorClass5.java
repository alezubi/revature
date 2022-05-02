package Day2;

class Games{
    public String title;
    public String company;
    public int price;
    public double rating;
    public String console;

    public Games(String title, String company, int price, double rating, String console){
        this.title=title;
        this.company=company;
        this.price=price;
        this.rating=rating;
        this.console=console;

    }
    public void gameInfo(){
        System.out.println("Title:" + title);
        System.out.println("Company:" + company);
        System.out.println("Price:" + price +"$");
        System.out.println("Rating:" + rating);
        System.out.println("Console:" + console);
        System.out.println("");
    }

}


public class ConstructorClass5 {
    public static void main(String[] args) {
        Games game1 = new Games("Minecraft","Microsoft",20,4.5,"PS5,XBOX,PC,Mobile");
        game1.gameInfo();
        Games game2 = new Games("Call of Duty","Ubisoft",60,3.5,"Ps5,PC,Mobile");
        game2.gameInfo();
        Games game3 = new Games("Fortnite","Activision",0,4.7,"PS5,XBOX,PC,Mobile");
        game3.gameInfo();
        Games game4 = new Games("League of Legends","Ubisoft",0,4.9,"PC");
        game4.gameInfo();
    }
}
