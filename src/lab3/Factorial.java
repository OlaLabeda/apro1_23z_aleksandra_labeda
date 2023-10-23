package lab3;

public class Factorial {
    public static void main(String[] args) {
        short N = 4;
        int result = 1;
        while (N > 1) {
            result *= N;
            N--;
        }
        System.out.println(result);
    }
}
