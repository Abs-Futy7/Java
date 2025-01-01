// Write a Java program to create a class called "Customer" with attributes for name, email, and purchase history.
// Implement methods to add purchases to the history and calculate total expenditure.
// Create a subclass "LoyalCustomer" that adds a discount rate attribute and a method to apply the discount.

class Customer{
    private String name;
    private String email;
    private double[] purchaseHistory;
    private int purchaseCount;

    public Customer(String name, String email){
        this.name = name;
        this.email = email;
        this.purchaseHistory = new double[10];
        this.purchaseCount = 0;
    }

    public void addPurchase(double amount){
        if (purchaseCount == purchaseHistory.length) {
            double[] newPurchaseHistory = new double[purchaseHistory.length * 2];
            // Copy elements manually using a for loop
            for (int i = 0; i < purchaseHistory.length; i++) {
                newPurchaseHistory[i] = purchaseHistory[i];
            }
            purchaseHistory = newPurchaseHistory;
        }
        purchaseHistory[purchaseCount++] = amount;
    }

    public double calculateTotalExpenditure() {
        double total = 0;
        // Loop through each purchase and sum up the amounts
        for (int i = 0; i < purchaseCount; i++) {
            total += purchaseHistory[i];
        }
        return total;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Getter for the purchase history
    public double[] getPurchaseHistory() {
        double[] actualHistory = new double[purchaseCount];
        // Copy only the valid purchases to the new array
        for (int i = 0; i < purchaseCount; i++) {
            actualHistory[i] = purchaseHistory[i];
        }
        return actualHistory;
    }

}

class LoyalCustomer extends Customer {
    // Attribute for the discount rate
    private double discountRate;

    // Constructor to initialize the LoyalCustomer with name, email, and discount rate
    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);  // Call the superclass constructor
        this.discountRate = discountRate;
    }

    // Method to apply the discount to a given amount
    public double applyDiscount(double amount) {
        return amount - (amount * discountRate / 100);
    }

    // Override the addPurchase method to apply the discount before adding the purchase
    @Override
    public void addPurchase(double amount) {
        double discountedAmount = applyDiscount(amount);
        super.addPurchase(discountedAmount);  // Call the superclass method to add the discounted amount
    }

    // Getter for the discount rate
    public double getDiscountRate() {
        return discountRate;
    }

    // Setter for the discount rate
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}

public class CustomerManagement {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Talisha Dion", "talisha@example.com");
        customer1.addPurchase(200);
        customer1.addPurchase(300);
        System.out.println("Total expenditure for " + customer1.getName() + ": " + customer1.calculateTotalExpenditure());

        // Create a loyal customer with a discount rate
        LoyalCustomer loyalCustomer = new LoyalCustomer("Fulchard Sofya", "fulchard@example.com", 10); // 10% discount
        loyalCustomer.addPurchase(200);
        loyalCustomer.addPurchase(300);
        System.out.println("Total expenditure for " + loyalCustomer.getName() + " after discount: " + loyalCustomer.calculateTotalExpenditure());
    }
}
