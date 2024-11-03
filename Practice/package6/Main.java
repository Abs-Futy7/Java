/*
 Write a Java program to create a class called "Bank" with a
 collection of accounts and methods to add and remove accounts,
 and to deposit and withdraw money. Also define a class called
 "Account" to maintain account details of a particular customer. 
 */


package package6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("Peter Irmgard", "C0011", 5000);
        Account account2 = new Account("Katja Ruedi", "C0121", 4500);
        Account account3 = new Account("Marcella Gebhard", "C0222", 20000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        ArrayList<Account> accounts = bank.getAccounts();

        for (Account account: accounts) {
            System.out.println(account.getInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");

        bank.depositMoney(account1, 1000);

        System.out.println(account1.getInfo());

        System.out.println("After withdrawing 5000 from account3:");
        bank.withdrawMoney(account3, 5000);
        System.out.println(account3.getInfo());

    }
}
