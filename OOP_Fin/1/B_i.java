// Parent class Account
class Account {
    int accountNumber;
    String name;
    double balance;

    // Parameterized constructor
    Account(int n, String s, double b) {
        accountNumber = n;
        name = s;
        balance = b;
    }

    // toString method to return account details
    public String toString() {
        return "Account Number: " + accountNumber + ", Name: " + name + ", Balance: " + balance;
    }
}

// Child class CurrentAccount
class CurrentAccount extends Account {
    boolean hasChequeBook;

    // Parameterized constructor
    CurrentAccount(int n, String s, double b, boolean chequeBook) {
        super(n, s, b); // Calling parent class constructor
        this.hasChequeBook = chequeBook;
    }

    // Overriding toString method
    public String toString() {
        return super.toString() + ", ChequeBook Facility: " + (hasChequeBook ? "Yes" : "No");
    }
}

// Child class SavingsAccount
class SavingsAccount extends Account {
    double yearlyInterestRate;

    // Parameterized constructor
    SavingsAccount(int n, String s, double b, double interestRate) {
        super(n, s, b); // Calling parent class constructor
        this.yearlyInterestRate = interestRate;
    }

    // Overriding toString method
    public String toString() {
        return super.toString() + ", Yearly Interest Rate: " + yearlyInterestRate + "%";
    }
}
