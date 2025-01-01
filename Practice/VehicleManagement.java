// Write a Java program to create a class called "Vehicle" with attributes for make, model, and year.
// Create subclasses "Car" and "" that add specific attributes like trunk size for cars and payload
// capacity for trucks. Implement a method to display vehicle details in each subclass.

class Vehicle{
    private String make;
    private String model;
    private String year;

    public Vehicle(String make, String model, String year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class Truck extends Vehicle{
    private double payloadCapacity;
    public Truck(String make, String model, String year, double payloadCapacity){
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity(){
        return payloadCapacity;
    }

    public void display(){
        super.displayDetails();
        System.out.println("Payload Capacity: " + payloadCapacity);
    }

    public void setPayloadCapacity(double payloadCapacity) {
        if (payloadCapacity > 0) {
            this.payloadCapacity = payloadCapacity;
        } else {
            System.out.println("Payload capacity must be positive.");
        }
    }
}

class Car extends Vehicle{
    private double trunkSize;
    public Car(String make, String model, String year, double trunkSize){
        super(make, model, year);
        this.trunkSize = trunkSize;
    }

    public double getTrunkSize(){
        return trunkSize;
    }

    public void display(){
        super.displayDetails();
        System.out.println("Trunk Size: " + trunkSize);
    }

    public void setTrunkSize(double trunkSize) {
        if (trunkSize > 0) {
            this.trunkSize = trunkSize;
        } else {
            System.out.println("Trunk size must be positive.");
        }
    }
}

public class VehicleManagement {
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki", "Swift", "2015", 15.1);
        c1.displayDetails();

        Truck t1 = new Truck("Ford", "F-150", "2016", 3.5);
        t1.displayDetails();
    }
}
