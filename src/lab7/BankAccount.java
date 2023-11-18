package lab7;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Wpłata na konto " + accountNumber + ": " + amount);
        } else {
            System.out.println("Nieprawidłowa kwota wpłaty.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Wypłata z konta " + accountNumber + ": " + amount);
        } else {
            System.out.println("Nieprawidłowa kwota wypłaty lub niewystarczające środki.");
        }
    }

}
