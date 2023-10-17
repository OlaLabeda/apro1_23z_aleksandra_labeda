package lab2;

import java.util.Scanner;
public class lab2 {  
    public static void main(String[] args) {
    
        // Tworzenie obiektu Scanner do odczytu danych z konsoli
        Scanner scanner = new Scanner(System.in);



        // Prośba o wprowadzenie pseudonimu
        System.out.print("Podaj swoj pseudonim: ");
        String pseudonim = scanner.nextLine();
        pseudonim = vovels_to_z(pseudonim);
        pseudonim = odwrocSlowa(pseudonim);

        // Prośba o wprowadzenie imienia
        System.out.print("Podaj swoje imię: ");
        String imie = scanner.nextLine();
        imie = vovels_to_z(imie);
        imie = odwrocSlowa(imie);

        System.out.println("Hello world\n" + "pseudonim: "
                + pseudonim + "\nimie:" +imie);

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

    public static String odwrocSlowa(String tekst) {
        char[] tablicaZnakow = tekst.toCharArray();
        int start = 0;
        int end = tekst.length() - 1;

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
