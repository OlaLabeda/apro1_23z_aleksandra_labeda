package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Main {
    public static void main(String [] args) {
        Person teacher = new Teacher("Pawel", "Bak", "PhD",
                new Birthdate(23,11,1984),
                "Ciechanow", "APRO1", "WEITI", 6);
        teacher = new Student("Aneta", "Kowalska", "WEiTI",
                new Birthdate(14,12,2003), "Nowy Dwor Mazowiecki",
                "WEITI", "Cyberbezpieczenstwo");
    }
}
