package lab2_1;
import java.util.Scanner;
public class lab2_1 {
    public static void main(String[] args) {

        // Tworzenie obiektu Scanner do odczytu danych z konsoli
        Scanner scanner = new Scanner(System.in);

        // Prośba o wprowadzenie imienia
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();

        // Prośba o wprowadzenie pseudonimu
        System.out.print("Podaj swoj pseudonim: ");
        String pseudonim = scanner.nextLine();

        System.out.println("Hello world\n" + "pseudonim: " +
                pseudonim + "\nimie: " +imie);

        // Zamykanie obiektu Scanner
        scanner.close();
    }
}
