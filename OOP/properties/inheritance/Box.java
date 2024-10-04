package properties.inheritance;

public class Box {
    double l;
    double b;
    double h;

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    // cube

    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }

    Box(double l, double b, double h){
        this.l = l;
        this.b = b;
        this.h = h;
    }

    Box(Box old){
        this.l = old.l;
        this.b = old.b;
        this.h = old.h;
    }

    public void information(){
        System.out.println("Running the box");
    }
}
