package lab3_1;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class Factorial {
    public static void main(String[] args) {
        short N = 4;
        int result = 1;
        while (N > 1) {
            result*= N;
            N--;
        }
        System.out.println(result);
    }
}