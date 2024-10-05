package properties.polymorphism;

public class Circle extends Shape{

    // this will run when the object of circle is created
    // hence it is overriding method
    @Override // this is called annotation, it checks being override or not
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
