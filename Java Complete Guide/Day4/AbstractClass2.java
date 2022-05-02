package Day4;

abstract class Shape{
    public double width;
    public double height;
    public final float pie =3.14f;
    public double radius;

    public abstract void getArea();

}

class Rectangle extends Shape{

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Rectangle Area: " + (width * height));
    }

    public void create() {
        System.out.println("Rectangle drawing....");
    }
}

class Circle extends Shape{

    public Circle(double radius){
        this.radius = radius;
    }

    public void getCircle(){
        System.out.println("Circle drawing....");
    }


    @Override
    public void getArea() {
    this.radius=radius;
        System.out.println("Circle Area: " + (pie * radius * radius));

    }
}



public class AbstractClass2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(46.34,56.34);
        Circle circle = new Circle(55.55);

        rectangle.create();
        rectangle.getArea();

        circle.getCircle();
        circle.getArea();

    }
}
