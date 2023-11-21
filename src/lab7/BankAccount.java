package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class BankAccount {
    /**
     * Bank account number
     */
    private String accountNumber;
    /**
     * Bank account balance
     */
    private double balance;
    /**
     *
     * @param accountNumber
     * @param balance
     *
     * Bank account constructor
     * creates an account with given account number
     * and balance
     */
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    /**
     * @return
     * Returns account number
     */
    public String getAccountNumber() {
        return accountNumber;
    }
    /**
     * @return
     * returns Bank account balance
     */
    public double getBalance() {
        return balance;
    }
    /**
     * allows putting money on the account
     * @param amount
     */

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Wpłata na konto " + accountNumber + ": " + amount);
        } else {
            System.out.println("Nieprawidłowa kwota wpłaty.");
        }
    }
    /**
     * @param amount
     * withdraws given amount from an account if theres such possibility
     */
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Wypłata z konta " + accountNumber + ": " + amount);
        } else {
            System.out.println("Nieprawidłowa kwota wypłaty lub niewystarczające środki.");
        }
    }

}

