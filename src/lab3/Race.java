package lab3;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                        //na poczatku pierwsze, drugie, trzecie miejsce zajmuje osoba o indkesie 0
                        int first_place=0;
                        int second_place=0;
                        int third_place=0;
                        for (int i=0; i<names.length; i++) {
                            /*  jeżeli czas osoby o indeksie i jest mniejszy od czasu
                                osoby o pierwszym miejscu to przypisujemy osobie o danym indeksie
                                pierwsze miejsce, a pozostałe osby "spychamy" o jedno miejsce w dół
                             */
                            if(times[i]<times[first_place]){
                                third_place=second_place;
                                second_place=first_place;
                                first_place=i;
                            }
                            /*  jeżeli czas osoby o indeksie i jest mniejszy od czasu
                                osoby o drugim miejscu to przypisujemy osobie o danym indeksie
                                drugie miejsce, a pozostałe osby "spychamy" o jedno miejsce w dół
                             */
                            else if(times[i]<times[second_place]){
                                third_place=second_place;
                                second_place=i;
                            }
                            /*  jeżeli czas osoby o indeksie i jest mniejszy od czasu
                                osoby o trzecim miejscu to przypisujemy osobie o danym indeksie
                                trzecie miejsce
                             */
                            else if(times[i]<times[third_place]){
                                third_place=i;
                            }
                        }
                        System.out.println("First place: "+names[first_place]+ ", time :"+times[first_place]);
                        System.out.println("Second place: "+names[second_place]+ ", time :"+times[second_place]);
                        System.out.println("Third place: "+names[third_place]+ ", time :"+times[third_place]);
                        break;
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