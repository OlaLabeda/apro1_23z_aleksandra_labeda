package lab7;
import java.util.ArrayList;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class BankCustomer {
    /**
     * counter for unique account numbers
     */
    private static int nextAccountNumber = 1; // Licznik dla unikalnych numerów konta
    /**
     * using composition - personal data of a user
     */
    PersonalData personalData;
    /**
     * using aggregation - list of accounts that abelong to a user
     */
    private ArrayList<BankAccount> accounts;
    /**
     * constructor for Bank customer sets personal data and
     * initializes new ArrayList with accounts of a given user
     */
    public BankCustomer(PersonalData personalData) {
        this.personalData = personalData;
        this.accounts = new ArrayList<>();
    }

    /**
     * method for adding a new account for a user
     * uses generateAccountNumber() function to generate a new
     * account number
     * creates a new BankAccount with that number and sets balance to 0
     */
    public void addAccount() {
        String accountNumber = generateAccountNumber();
        BankAccount account = new BankAccount(accountNumber, 0.0);
        accounts.add(account);
        System.out.println("Konto utworzone: " + accountNumber);
    }

    /**
     * method for generating an account number
     * sets first 3 signs as ACC and concatenates
     * an int equal to the static int counter of created accounts
     * increases counter value with +1
     */
    private String generateAccountNumber() {

        return "ACC" + nextAccountNumber++;
    }
    /**
     * @param accountNumber
     * @param amount
     * method deposit finds an acount of a user of given account number
     * and then uses a method deposit of a BankAccount class to set new value
     * in balance parameter
     */
    public void deposit(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Konto o numerze " + accountNumber + " nie istnieje.");
    }

    /**
     * @param accountNumber
     * @param amount
     * method withdraw finds an acount of a user of given account number
     * and then uses a method withdraw of a BankAccount class to set new value
     * in balance parameter
     */
    public void withdraw(String accountNumber, double amount) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Konto o numerze " + accountNumber + " nie istnieje.");
    }

    /**
     *
     * @param accountNumber
     * @return
     * returns balance of account of a given account number
     */
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
