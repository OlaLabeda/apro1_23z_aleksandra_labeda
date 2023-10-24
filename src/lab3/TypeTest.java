package lab3;

/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */

public class TypeTest {
    public static void main(String[] args) {

        // Deklaracja i przypisanie zmiennej "daysInYear" jako "short" o wartości 365.
        //krotka calkowita
        short daysInYear = 365;

        // Rzutowanie zmiennej "daysInYear" na typ "char" (znakowy).
        // ASCII 365 odpowiada niestandardowemu znakowi.
        char x = (char) daysInYear;

        // Deklaracja i przypisanie zmiennej "someNumber" jako "int" (calkowita)
        // o wartości 555.
        int someNumber = 555;

        // Rzutowanie zmiennej "someNumber" na typ "short".
        // Brak problemów z przekroczeniem zakresu.
        short castSomeNumber = (short) someNumber;

        // Rzutowanie dużej liczby "1_111_111" na typ "short".
        // Może spowodować przepełnienie.
        short reallyBig = (short) 1_111_111;

        // Dodanie 1 do znaku 'a'. Wynik to znak 'b'.
        char letter = 'a' + 1;

        // Dodanie 1 do ASCII 'a' (97). Wynik to 98.
        int value = 1 + (int) 'a';

        // Wyświetlenie wartości zmiennych.
        System.out.println(daysInYear);  // Wyświetla 365
        System.out.println(x); // Wyświetla niestandardowy znak
        System.out.println(someNumber); // Wyświetla 555
        System.out.println(castSomeNumber); // Wyświetla 555
        System.out.println(reallyBig); // Wyświetla -3001 (ze względu na przepełnienie)
        System.out.println(letter); // Wyświetla 'b'
        System.out.println(value); // Wyświetla 98


        // Deklaracja i przypisanie zmiennej "firstFloat"
        // jako "float" o wartości 1.443543322.
        float firstFloat = 1.443543322f;

        // Rzutowanie "firstFloat" na "int".
        // Część dziesiętna zostanie obcięta, wynik to 1.
        int castFloat = (int) firstFloat;

        // Deklaracja dwóch zmiennych "first" i "second"
        // jako "float" z wartościami 1.44 i 4.33.
        float first = 1.44f;
        float second = 4.33f;

        // Dodanie "first" i "second".
        // Wynik zostanie przechowany jako "float".
        float additionResult = first + second;

        // Dzielenie "first" przez "second".
        // Wynik zostanie przechowany jako "float".
        float division = first / second;

        // Dodanie bardzo dużych liczb "addBig".
        // Może prowadzić do utraty precyzji.
        float addBig = 55554889857.1f + 0.00000001f;

        // Dzielenie przez bardzo małą liczbę "divideBig".
        // Może prowadzić do błędów zaokrągleń.
        float divideBig = 555414.0f / 0.0000000001f;

        // Wyświetlenie wyników zmiennych zmiennoprzecinkowych.
        System.out.println(firstFloat); // Wyświetla 1.4435433
        System.out.println(castFloat); // Wyświetla 1
        System.out.println(first); // Wyświetla 1.44
        System.out.println(second); // Wyświetla 4.33
        System.out.println(additionResult); // Wyświetla wynik dodawania
        System.out.println(division); // Wyświetla wynik dzielenia
        System.out.println(addBig); // Wyświetla wynik dodawania bardzo dużych liczb
        System.out.println(divideBig); // Wyświetla wynik dzielenia przez bardzo małą liczbę
/*
        ODPOWIEDZ NA PYTANIE DO ZADANIA

                - Wartości zmiennych po prawej stronie operatora przypisania są
        rzutowane na odpowiednie typy, co jest konieczne,
        aby zachować spójność typów.
        Zmienne, na których wykonane były operacje,
        przechowują wyniki tych operacji.

                Jawne rzutowanie jest konieczne w przypadkach,
        gdy zmienne oczekują wartości innego typu niż wartość po prawej stronie przypisania.
        W przeciwnym przypadku, jeśli typy są kompatybilne, rzutowanie może być pominięte.
        Jednak zawsze należy uważać na potencjalne utraty danych lub
        przepełnienia podczas rzutowania.
        Rzutowanie niejawne - kiedy zmiennej o szerszym zakresie przypisuje sie wartosc
        zmiennej o weższym zakresie np. short a = 3; int x = a;

        - Problemy z liczbami zmiennoprzecinkowymi wynikają z ograniczeń precyzji
        w reprezentacji float i zaokrągleń.
        -> W przypadku dodawania
        bardzo dużych lub dzielenia przez bardzo małe liczby,
        może dojść do utraty precyzji i błędów obliczeniowych.

 */
    }
}