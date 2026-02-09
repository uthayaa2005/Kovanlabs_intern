package com.kovanlabs.intern.oops;

abstract class Shape {
    abstract double getArea();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius){

        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI *radius * radius;

    }
}
class Square extends Shape {
    private double side;
    public Square(double side){

        this.side = side;
    }
    @Override
    double getArea(){

        return side * side;
    }
}


public class ShapeFactory {
    public static void main(String[] args) {

        Shape[] Shapes = {new Circle(1) , new Square(0) , new Circle(1)};

        double totalArea  =0;
        for (Shape shape : Shapes){
            totalArea += shape.getArea();
        }
System.out.println(totalArea);
    }
}
