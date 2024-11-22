/*
 Write a Java program to create a class called "BankAccount" with
 attributes for account number, account holder's name, and balance.
 Include methods for depositing and withdrawing money, as well as
 checking the balance. Create a subclass called "SavingsAccount" that
 adds an interest rate attribute and a method to apply interest.
 */

import java.util.Scanner;

class BankAccount{
    private String name;
    private String accNo;
    private double balance;

    public BankAccount(String name, String accNo, double balance){
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
        System.out.println("Deposited : " + amount + "\nNew Balance : " + balance);
    }

    public void withdraw(double amount){
        if(amount > 0 && amount < balance){
            balance -= amount;
        }
       System.out.println("Withdrawed : " + amount + "\nNew Balance : " + balance);
    }

    public double checkBalance(){
        return balance;
    }

    public String getAccount(){
        return name;
    }

    public String getAccNo(){
        return accNo;
    }
}

class SavingAccount extends BankAccount{
    private double interestRate;
    public SavingAccount(String name, String accNo, double balance, double initialBalance, double interestRate){
        super(name, accNo, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest(){
        double interest = checkBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied : " + interest);
        System.out.println("Balance after applying interest : " + checkBalance());
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interest){
        if(interestRate > 0){
            this.interestRate = interestRate;
        }
    }
}

public class BankMangement {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Abs", "2022515922", 10000);
        BankAccount acc2 = new BankAccount("Jack", "2024415922", 10000);

        SavingAccount scc1 = new SavingAccount("Nira", "20222222", 10000, 50000, 4);

        Scanner sc = new Scanner(System.in);

        System.out.println("What kind of account you have? \n1. Regular\n2. Savings");

        String n = sc.nextLine();

        if(n.equals("1")){
            System.out.println("Enter your account number : ");
            String no = sc.nextLine();
            if(no.equals(acc1.getAccNo())){
                System.out.println("Welcome " + acc1.getAccount() + ".\n1. Check Balance\n2. Deposit\n3. Withdraw");
                String choose = sc.nextLine();
                if(choose.equals("1")){
                    System.out.println("Balance : " + acc1.checkBalance());
                }
                else if(choose.equals("2")){
                    System.out.println("Enter amount to deposit : ");
                    double amount = sc.nextDouble();
                    acc1.deposit(amount);
                    //System.out.println("Deposited Successfully");
                }
                else{
                    System.out.println("Enter amount to withdraw : ");
                    double amount = sc.nextDouble();
                    acc1.withdraw(amount);
                    //System.out.println("Withdrawed Successfully");
                }
            }
            else{
                System.out.println("Welcome " + acc2.getAccount() + ".\n1. Check Balance\n2. Deposit\n3. Withdraw");
                String choose = sc.nextLine();
                if(choose.equals("1")){
                    System.out.println("Balance : " + acc2.checkBalance());
                }
                else if(choose.equals("2")){
                    System.out.println("Enter amount to deposit : ");
                    double amount = sc.nextDouble();
                    acc2.deposit(amount);
                    //System.out.println("Deposited Successfully");
                }
                else{
                    System.out.println("Enter amount to withdraw : ");
                    double amount = sc.nextDouble();
                    acc2.withdraw(amount);
                    //System.out.println("Withdrawed Successfully");
                }
            }
        }
        else{
            System.out.println("Enter your account number : ");
            String no = sc.nextLine();
            if(no.equals(scc1.getAccNo())){
                System.out.println("Welcome " + scc1.getAccount() + ".\n1. Check Balance\n2. Deposit\n3. Withdraw\n4. Apply interest");
                String choose = sc.nextLine();
                if(choose.equals("1")){
                    System.out.println("Balance : " + scc1.checkBalance());
                }
                else if(choose.equals("2")){
                    System.out.println("Enter amount to deposit : ");
                    double amount = sc.nextDouble();
                    scc1.deposit(amount);
                    //System.out.println("Deposited Successfully");
                }
                else if(choose.equals("3")){
                    System.out.println("Enter amount to withdraw : ");
                    double amount = sc.nextDouble();
                    scc1.withdraw(amount);
                    //System.out.println("Withdrawed Successfully");
                }
                else{
                    System.out.println("Apply interest rate : ");
                    double interest = sc.nextDouble();
                    scc1.applyInterest();
                    //System.out.println("Interest applied ");
                }
            }
        }
    }
}
