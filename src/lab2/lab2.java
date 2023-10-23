package lab2;
import java.util.Scanner;
public class lab2 {
    public static void main(String[] args) {
        System.out.println("Hello world!");

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
