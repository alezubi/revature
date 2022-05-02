package Day12;

import java.util.ArrayList;
import java.util.List;

public class AbstractsClass_And_Multiple_Inheritance {
    public static void main(String[] args) {

        List<Rectangle> rectangleList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();
        List<Cone> coneList = new ArrayList<>();

        Output output = new Output();
//        output.drawShape(rectangleList);
//        output.drawShape(circleList);
//        output.drawShape(coneList); // error


    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing rectangle...");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("drawing circle...");
    }
}

class Cone {
    void draw(){
        System.out.println("drawing cone...");
    }
}

class Output {
    // creating a method that accept only child class of shape class
    public static void drawShape(List<? extends Shape> list){
        for (Shape shape : list) {
            shape.draw(); // calling method of shape class by child class instance
        }
    }
}

abstract class Shape {
    abstract void draw();
}

