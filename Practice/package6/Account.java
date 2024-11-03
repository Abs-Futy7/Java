package package6;

public class Account {
    private String name;
    private String account;
    private double balance;

    public Account(String name, String account, double balance){
        this.name = name;
        this.account = account;
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public String getAccount(){
        return account;
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String getInfo(){
        return "Name: " + name + "Account: " + account + "Balance: " + balance;
    }
}
