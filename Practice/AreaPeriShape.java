/*
 Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter,
 and subclasses for "Rectangle", "Circle", and "Triangle".

Note: An abstract class is a class that is declared abstract—it may or may not include abstract methods.
Abstract classes cannot be instantiated, but they can be subclassed.

An abstract method is a method that is declared without an implementation
(without braces, and followed by a semicolon).
 */

abstract class Shape{
    public abstract double getArea();
    public abstract double getPerimeter();
}


class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length*width;
    }

    public double getPerimeter(){
        return 2*(width + length);
    }
}

class Circle extends Shape{
    private double radious;

    Circle(double radious){
        this.radious = radious;
    }

    public double getArea(){
        return 3.1416 * radious * radious;
    }

    public double getPerimeter(){
        return 2* 3.1416* radious;
    }
}


public class AreaPeriShape{
    public static void main(String[] args) {
        Shape rect = new Rectangle(10, 20);
        Shape circle = new Circle(5);

        System.out.println("\nArea and perimeter of various shapes:");

        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
    }
}