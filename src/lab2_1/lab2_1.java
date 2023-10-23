package lab2_1;
import java.util.Scanner;
public class lab2_1 {
    public static void main(String[] args) {

        // Tworzenie obiektu Scanner do odczytu danych z konsoli
        Scanner scanner = new Scanner(System.in);

        // Prośba o wprowadzenie imienia
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();
        imie = odwrocSlowa(imie);
        imie = vovels_to_z(imie);

        // Prośba o wprowadzenie pseudonimu
        System.out.print("Podaj swoj pseudonim: ");
        String pseudonim = scanner.nextLine();
        pseudonim = odwrocSlowa(pseudonim);

        System.out.println("Hello world\n" + "pseudonim: " +
                pseudonim + "\nimie: " +imie);
        pseudonim = vovels_to_z(pseudonim);

        System.out.println("Hello world\n" + "imie:" +imie + "\npseudonim: "
                + pseudonim );

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

    public static String vovels_to_z (String tekst) {
        // Zamienia wszystkie samogłoski na "z" (zarówno małe, jak i duże litery)
        //replaceAll - szuka wszystkich wystapien wzorca w tekscie
        //"[aeiouAEIOU]" <= wyrazenie regularne, znaki jakie maja zostac potencjalnie zamienione
        // [] <=zestaw znakow
        tekst = tekst.replaceAll("[aeiouyAEIOUY]", "z");
        return tekst;
    }

}
