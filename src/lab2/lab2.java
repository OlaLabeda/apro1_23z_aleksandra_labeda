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
        imie = odwrocSlowa(imie);

        // Prośba o wprowadzenie pseudonimu
        System.out.print("Podaj swoj pseudonim: ");
        String pseudonim = scanner.nextLine();
        pseudonim = odwrocSlowa(pseudonim);

        System.out.println("Hello world\n" + "pseudonim: " +
                pseudonim + "\nimie: " +imie);
        // Zamykanie obiektu Scanner
        scanner.close();
    }
    public static String odwrocSlowa(String tekst) {
        //utorzenie pomocniczej tablicy znakow
        char[] tablicaZnakow = tekst.toCharArray();
        //uwtorzenie znacznikow poruszajacyh sie po tekscie
        //ktory ma zostac odwrocony
        int start = 0;
        int end = tekst.length() - 1;

        //petla przechodzaca po znakach tekstu odwracajaca ich kolejnosc
        while (start < end) {
            char temp = tablicaZnakow[start];
            tablicaZnakow[start] = tablicaZnakow[end];
            tablicaZnakow[end] = temp;
            start++;
            end--;
        }

        return new String(tablicaZnakow);
    }
}
