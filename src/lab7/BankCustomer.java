package lab7;
import java.util.ArrayList;
public class BankCustomer {
    private static int nextAccountNumber = 1; // Licznik dla unikalnych numerów konta
    PersonalData personalData;
    private ArrayList<BankAccount> accounts;
    public BankCustomer(PersonalData personalData) {
        this.personalData = personalData;
        this.accounts = new ArrayList<>();
    }

    // Metoda do dodawania konta
    public void addAccount() {
        String accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountNumber, 0.0);
        accounts.add(account);
        System.out.println("Konto utworzone: " + accountNumber);
    }

    // Metoda do generowania unikalnego numeru konta
    private String generateAccountNumber() {
        return "ACC" + nextAccountNumber++;
    }
    public void deposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Konto o numerze " + accountNumber + " nie istnieje.");
    }

    public void withdraw(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Konto o numerze " + accountNumber + " nie istnieje.");
    }
    public double getBalance(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account.getBalance();
            }
        }
        System.out.println("Konto o numerze " + accountNumber + " nie istnieje.");
        return 0;
    }
}