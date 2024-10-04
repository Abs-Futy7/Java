package properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double l, double b, double h, double weight){
        super(l, b, h); // call the parent class constructor
        // used to initiate values present in parent cls
        this.weight = weight;

        // but it cannot get parent cls objects if that is in private
    }
}
