class Account {
    private double balance = 0;

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(1000);
        acc.withdraw(300);
        System.out.println("Balance: $" + acc.getBalance());
    }
}
//