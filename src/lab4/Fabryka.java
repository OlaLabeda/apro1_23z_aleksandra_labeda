package lab4;

import java.util.Scanner;

public class Fabryka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jednostkiTowaru = scanner.nextInt();
        int liczbaMaszyn = scanner.nextInt();
        int[] szybkoscPracy = new int[liczbaMaszyn];
        for (int i = 0; i < liczbaMaszyn; i++) {
            szybkoscPracy[i] = scanner.nextInt();
        }

        int sumaTowarow = 0;
        int liczbaDni = 0;
        while (sumaTowarow < jednostkiTowaru) {
            liczbaDni++;
            for (int i = 0; i < liczbaMaszyn; i++){
                if (liczbaDni % szybkoscPracy[i] == 0) {
                    sumaTowarow++;
                }
            }
        }
        System.out.println(liczbaDni);
    }
}
