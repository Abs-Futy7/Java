
/*Write a Java program to create a basic
Java thread that prints "Hello, World!" when executed.  */


public class HelloWorld extends Thread{
    @Override
    public void run(){
        System.out.println("Hello World");
    }

    public static void main(String[] args){
        HelloWorld hello = new HelloWorld();
        hello.start();
    }
}