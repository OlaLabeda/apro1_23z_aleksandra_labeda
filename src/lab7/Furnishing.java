package lab7;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Furnishing {
    public static void main(String... args) {
        Furniture chair = new Chair("z oparciem"),
                chair2 = new Chair("z podłokietnikami"),
                table = new Table(4, "prostokątny z czterema nogami"),
                table2 = new Table(1, "okrągły z jedną nogą"),
                table3 = new Table(1, "kwadratowy z jedna nogą"),
                couch = new Couch(2, "typu sofa"),
                couch2 = new Couch(2, "typu wersalka");
        System.out.println("W pokoju stoi " + couch + " i " + table +
                ". Jest tylko jedno " + chair);
        System.out.println("W innym pokoju znajdują się: " + table2 +
                " i " + table3);
        if (table2.equals(table3)) {
            System.out.println("Te stoły mają tyle samo nóg");
        } else {
            System.out.println("Każdy ze stołów ma inną liczbę nóg");
        }

    }
}