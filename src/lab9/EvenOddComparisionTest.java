package lab9;

public class EvenOddComparisionTest {
    public static void main(String[] args) {
        String a = "abcd";
        String b = "cbad";
        if (EvenOddComparision.evenOddComparision(a, b)) {
            System.out.println("Łańcuchy mogą być takie same po zamianie miejscami parzystymi lub nieparzystymi.");
        } else {
            System.out.println("Łańcuchy nie mogą być takie same po zamianie miejscami parzystymi lub nieparzystymi.");
        }

    }
}
