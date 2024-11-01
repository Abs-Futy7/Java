/*
 Write a Java program to create a class called "Rectangle" with width and height attributes.
 Calculate the area and perimeter of the rectangle. 
 */

package package3;

public class Main {
    public static void main(String[] args) {
        Rect rect1 = new Rect(5, 6);

        System.out.println("Area is : "+ rect1.getArea());
        System.out.println("Perimeter is : "+ rect1.getPerimeter());

        rect1.setWidth(20);

        System.out.println("Area is : "+ rect1.getArea());
        System.out.println("Perimeter is : "+ rect1.getPerimeter());
    }
}
