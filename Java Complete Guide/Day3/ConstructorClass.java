package Day3;

class Car{
   public String model;
   public String brand;
   public String color;
   public String engine;
   public int price;

   public Car(String model, String brand, String color, String engine, int price){
       this.model=model;
       this.brand=brand;
       this.color=color;
       this.engine=engine;
       this.price=price;

   }

   public Car(Car carObj, String color){
       this.model=carObj.model;
       this.brand=carObj.brand;
       this.color=color;
       this.engine=carObj.engine;
       this.price= carObj.price;
   }

    public void getCar(){
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Engine: " + engine);
        System.out.println("Price: " + price);
        System.out.println(" ");
    }

}

public class ConstructorClass {
    public static void main(String[] args) {
        Car car1 = new Car("Explorer","Ford","White","Gasoline",40000);
        Car car2 = new Car(car1,"Blue");
        Car car3 = new Car(car1,"Red");
        Car car4 = new Car(car2,"Yellow");
        car1.getCar();
        car2.getCar();
        car3.getCar();
        car4.getCar();

    }
}
