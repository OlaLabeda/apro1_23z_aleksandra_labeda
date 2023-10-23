package lab3;


import java.io.BufferedReader;
/*
    Klasa BufferedReader służy do odczytywania tekstu z wejścia znakowego,
    takiego jak klawiatura. Pozwala na odczyt znaków i łańcuchów znaków
    z wejścia tekstowego w bardziej efektywny sposób niż inne metody odczytu.
*/
import java.io.IOException;
/*
    IOException jest jednym z rodzajów wyjątków związanych z operacjami wejścia/wyjścia.
    Często używany do obsługi błędów, które mogą wystąpić podczas operacji
    wejścia/wyjścia, takich jak odczyt plików lub obsługa wyjątków związanych z klawiaturą.
*/
import java.io.InputStreamReader;
/*
    InputStreamReader służy do konwertowania bajtów z wejścia
    (np. System.in, co reprezentuje standardowe wejście, czyli klawiaturę)
    na znaki, które mogą być odczytywane za pomocą BufferedReader.
    Pozwala to na wygodne czytanie tekstu z klawiatury.

 */

public class Race {
    public static void main (String[] arguments) {
        String[] names = {
                "Jan", "Piotr", "Michal", "Pawel", "Jakub",
                "Stefan", "Robert", "Mariusz", "Tadeusz", "Konrad"
        };
        int[] times = {
                56, 60, 51, 44, 66, 50, 49, 62, 43, 70
        };
        while (true) {
            try {
                System.out.println(
                        "Choose an option: 1 - calculate; 2 - exit program");
                BufferedReader reader =
                        new BufferedReader(new InputStreamReader(System.in));
                int option = Integer.parseInt(reader.readLine());
                switch (option) {
                    case 1:
                        for (int i = 0; i < names.length; i++) {
                            for (int j = 0; j < names.length -1; j++) {
                                if (times[j] > times[j+1]) {
                                    int tmp = times[j];
                                    String tmpS = names[j];
                                    times[j] = times[j+1];
                                    names[j] = names[j+1];
                                    times[j+1] = tmp;
                                    names[j+1] = tmpS;
                                }
                            }
                        }
                        for (int i = 0; i < 3; i++) {
                            System.out.println(names[i] + " " + times[i]);
                        }
                    case 2:
                        return;
                    default:
                        System.out.println("Wrong option choose once again");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                System.out.println("You should write a number!");
            }
        }
    }
}
