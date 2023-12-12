package lab9;

import java.util.ArrayList;

/**
 * @author Aleksandra Łabęda
 */
public class MapTest {
    /**
     *
     * @param args
     * a main function calling written functions, printing number of islands
     * read from input and their sizes
     */
    public static void main(String[] args) {
        //small island
        Map map1 = MapReader.readMapFromFile("src\\resources/simple_input.txt");
        ArrayList<Island> islands1 =  MapReader.findIslands(map1);
        System.out.println("Ilosc wysp: " + islands1.size());
        System.out.println("Rozmiary: ");
        for (int i = 0; i < islands1.size(); i++) {
            System.out.println(islands1.get(i).getSize());
        }
        //big island
        Map map2 = MapReader.readMapFromFile("src\\large_input.txt");
        ArrayList<Island> islands2 = MapReader.findIslands(map2);
        System.out.println("Ilosc wysp: " + islands2.size());
        System.out.println("Rozmiary: ");
        for (int i = 0; i < islands2.size(); i++) {
            System.out.println(islands2.get(i).getSize());
        }
    }
}