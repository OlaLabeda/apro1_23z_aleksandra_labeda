package lab4;

public class Equation {
    public static void main(String[] args) {
        float a = 0, b = 2, c = 1; // set a, b, c
        new Equation().calculateAndPrintRoot(a, b, c);
        // write testing here
    }

    public void calculateAndPrintRoot(float a, float b, float c) {
        if (a == 0) {
            calculateAndPrintRoot(b, c);
        } else {
            float delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Brak miejsc zerowych!");
            }
            else {
                float p1 = 0, p2 = 0;
                float pierDelta = (float)Math.sqrt(delta);
                p1 = (-b -pierDelta) / (2 * a);
                p2 = (-b +pierDelta) / (2 * a);
                System.out.println("Miejsce zerowe 1: " + p1);
                System.out.println("Miejsce zerowe 2: " + p2);
            }
        }
    }

    public void calculateAndPrintRoot(float a, float b) {
        if (a == 0) {
            if (b != 0)
                System.out.println("Brak miejsc zerowych!");
            else
                System.out.println("Równanie tożsamościowe.");
        }
        else {
            float pierwiastek = -b / a;
            System.out.println("Miejsce zerowe: " + pierwiastek);
        }
    }
}