class BankAccount{
    private int balance;
    public BankAccount(int balance){
        this.balance = balance;
    }

    // Synchronized method to deposit money
    public synchronized void deposit(int amount){
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " Deposited " + amount + " New Balance : " + balance);
    }


    // Synchronized method to withdraw money
    public synchronized void withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Withdrawn " + amount + " New Balance : " + balance);
        }
        else{
            System.out.println(Thread.currentThread().getName() + " Withdrawal Failed. Insufficient Balance");
        }
    }

    public int getBalance(){
        return balance;
    }
}

class DepositThread extends Thread{
    private BankAccount account;
    private int amount;

    public DepositThread(BankAccount account, int amount){
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread{
    private BankAccount account;
    private int amount;

    public WithdrawThread(BankAccount account, int amount){
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        account.withdraw(amount);
    }
}



public class BankAccountSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        Thread deposit1 = new DepositThread(account, 5000);
        Thread deposit2 = new DepositThread(account, 3000);
        Thread withdraw1 = new WithdrawThread(account, 2000);
        Thread withdraw2 = new WithdrawThread(account, 4000);

        deposit1.start();
        deposit2.start();
        withdraw1.start();
        withdraw2.start();

        // Wait for all threads to complete
        try {
            deposit1.join();
            deposit2.join();
            withdraw1.join();
            withdraw2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance : " + account.getBalance());
    }
}

/*

Thread-0 Deposited 5000 New Balance : 15000
Thread-3 Withdrawn 4000 New Balance : 11000
Thread-2 Withdrawn 2000 New Balance : 9000 
Thread-1 Deposited 3000 New Balance : 12000
Final Balance : 12000

*/
