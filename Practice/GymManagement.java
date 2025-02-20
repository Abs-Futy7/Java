/*
Write a Java program to create a class called "GymMembership" with
attributes for member name, membership type, and duration.
Create a subclass "PremiumMembership" that adds attributes for personal
trainer availability and spa access. Implement methods to calculate membership 
fees and check for special offers based on membership type.
*/

class GymMembership {
    String name;
    String membershipType;
    int duration;

    public GymMembership(String name, String membershipType, int duration){
        this.name = name;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public double calculateFees(){
        double base = 50.0;
        return base*duration;
    }

    public String checkOffers(){
        if(membershipType.equals("Annual")){
            return "10% annual discount";
        }
        else{
            return "No special discount";
        }
    }

    public void display(){
        System.out.println("Member Name: " + name);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + calculateFees());
        System.out.println("Special Offers: " + checkOffers());
    }

}

class PremiumMembership extends GymMembership{
    Boolean personalTrainer;
    Boolean spaAccess;
    public PremiumMembership(String name, String membershipType, int duration, Boolean personalTrainer, Boolean spaAccess){
        super(name, membershipType, duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    public double calculateFees(){
        double baseFee = super.calculateFees();
        double additionalFee = 0.0;

        if (personalTrainer) {
            additionalFee += 30.0 * duration; // Additional fee per month for personal trainer
        }
        if (spaAccess) {
            additionalFee += 20.0 * duration; // Additional fee per month for spa access
        }
        return baseFee + additionalFee;
    }

    public void display(){
        super.display();
        System.out.println("Personal Trainer Available: " + (personalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }
}

public class GymManagement{
    public static void main(String[] args) {
    GymMembership basicMember = new GymMembership("Njeri Inka", "Monthly", 6);
    PremiumMembership premiumMember = new PremiumMembership("Willy Diantha", "Annual", 12, true, true);

        // Display details of the basic membership
        System.out.println("Basic Membership Details:");
        basicMember.display();

        // Display details of the premium membership
        System.out.println("\nPremium Membership Details:");
        premiumMember.display();
    }
}
