/*
 Write a Java program to create class called "TrafficLight" with attributes for color and duration,
 and methods to change the color and check for red or green.
 */


package package7;

public class Main {
    public static void main(String[] args) {
        TrafficLight tf = new TrafficLight("Red", 30);

        System.out.println("The light is red: " + tf.isRed());

        tf.changeColor("Green");
        System.out.println("The light is now green: " + tf.isGreen());

        tf.setDuration(20);
        System.out.println("The light duration is now: " + tf.getDuration());
    }
}
