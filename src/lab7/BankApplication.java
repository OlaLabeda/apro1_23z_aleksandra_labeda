package lab7;

public class BankApplication {
    public static void main(String[] args) {
        PersonalData personalData1 = new PersonalData("Felipe", "Bran", "94478512452");
        BankCustomer customer1 = new BankCustomer(personalData1);
        PersonalData personalData2 = new PersonalData("Kasia", "Bak", "78457485451");
        BankCustomer customer2 = new BankCustomer(personalData2);
        // Dodawanie kont
        customer1.addAccount();
        customer1.addAccount();
        customer2.addAccount();
        customer2.deposit("ACC3", 15);
        customer2.deposit("ACC3", 145);
        System.out.println(customer2.getBalance("ACC3"));
        customer2.withdraw("ACC3", 17.45);
        System.out.println(customer2.getBalance("ACC3"));
    }
}

