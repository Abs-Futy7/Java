// Driver class to test inheritance
public class InheritanceTest {
    public static void main(String[] args) {
        // Creating objects of CurrentAccount and SavingsAccount
        CurrentAccount ca = new CurrentAccount(101, "John Doe", 5000.00, true);
        SavingsAccount sa = new SavingsAccount(102, "Alice Smith", 8000.00, 4.5);

        // Displaying object details using toString method
        System.out.println("Current Account Details: " + ca.toString());
        System.out.println("Savings Account Details: " + sa.toString());
    }
}


/*
Output:

Current Account Details: Account Number: 101, Name: John Doe, Balance: 5000.0, ChequeBook Facility: Yes
Savings Account Details: Account Number: 102, Name: Alice Smith, Balance: 8000.0, Yearly Interest Rate: 4.5%

 */