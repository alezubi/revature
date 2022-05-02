package Day3;

class Carrito{
    public String brand;
    public String model;
    public int price;
    public double review;

    public Carrito(String a, String b, int c, double d){
        this.brand = a;
        this.model = b;
        this.price = c;
        this.review = d;

    }

    public Carrito(Carrito CarObj, int price){
        this.brand=CarObj.brand;
        this.model=CarObj.model;
        this.price=price;
        this.review= CarObj.review;


    }
    public Carrito(Carrito CarObj, double review){
        this.brand=CarObj.brand;
        this.model= CarObj.model;
        this.price= CarObj.price;
        this.review=review;
    }
    public Carrito(Carrito CarObj, String model){
        this.brand= CarObj.brand;
        this.model=model;
        this.price= CarObj.price;
        this.review= CarObj.review;
    }

    public void getCar(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Review " + review);
        System.out.println(" ");
    }

}



public class ConstructorClass3 {
    public static void main(String[] args) {
        Carrito carrito = new Carrito("Ford","Explorer",500,4.5);
        Carrito carrito1 = new Carrito(carrito,600);
        Carrito carrito2 = new Carrito(carrito, "Mustang");

        carrito.getCar();
        carrito1.getCar();
        carrito2.getCar();


    }
}
