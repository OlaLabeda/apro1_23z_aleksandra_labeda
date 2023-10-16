import java.util.Scanner;
public class lab2 {  
    public static void main(String[] args) {
    
        // Tworzenie obiektu Scanner do odczytu danych z konsoli
        Scanner scanner = new Scanner(System.in);

        // Prośba o wprowadzenie imienia
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();
        imie = vovels_to_z(imie);

        // Prośba o wprowadzenie pseudonimu
        System.out.print("Podaj swoj pseudonim: ");
        String pseudonim = scanner.nextLine();
        pseudonim = vovels_to_z(pseudonim);

        System.out.println("Hello world\n" + "imie:" +imie
            + "\npseudonim: " + pseudonim); 

        // Zamykanie obiektu Scanner
        scanner.close();
   
        
    }
    public static String vovels_to_z (String tekst) {
        // Zamienia wszystkie samogłoski na "z" (zarówno małe, jak i duże litery)
        //replaceAll - szuka wszystkich wystapien wzorca w tekscie
        //"[aeiouAEIOU]" <= wyrazenie regularne, znaki jakie maja zostac potencjalnie zamienione
        // [] <=zestaw znakow
        tekst = tekst.replaceAll("[aeiouyAEIOUY]", "z");
        return tekst;
    }
}
