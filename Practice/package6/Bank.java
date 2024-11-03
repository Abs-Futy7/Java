package package6;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank(){
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account){
        accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public void depositMoney(Account account, double amount){
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount){
        account.withdraw(amount);
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }
}
