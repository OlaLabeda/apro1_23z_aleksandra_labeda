package lab6;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */
public class ShortCircuitOperators {
    private static void testLeftShift() {
        System.out.println("Left Shift << :");
        int value = 1;
        for (int i = 0; i <= Integer.SIZE; i++) {
            System.out.println(value + " << " + i + " = " + (value << i));
        }
        System.out.println();
    }

    private static void testRightShift() {
        System.out.println("Right Shift >> :");
        int value = 0x80000000;
        for (int i = 0; i <= Integer.SIZE; i++) {
            System.out.println(value + " >> " + i + " = " + (value >> i));
        }
        System.out.println();
    }

    private static void testUnsignedRightShift() {
        System.out.println("Unsigned Right Shift >>>:");

        int value = 0x80000000;
        for (int i = 0; i <= Integer.SIZE; i++) {
            System.out.println(value + " >>> " + i + " = " + (value >>> i));
        }
        System.out.println();
    }

    private static boolean f1true() {
        System.out.format("f1true()%n");
        //System.out.printf("f1true()%n");// try this
        //System.out.println("f1true()");// try this
        return true;
    }

    private static boolean f1false() {
        System.out.printf("f1false()%n");
        return false;
    }

    public static void main(String[] args) {
        boolean b1, b2, b3, b4, b5, b6, b7, b8;
        b1 = f1true() & f1true();
        b2 = f1true() && f1true();
        b3 = f1false() & f1false();
        b4 = f1false() && f1false();
        b5 = f1true() | f1true();
        b6 = f1true() || f1true();
        b7 = f1false() | f1false();
        b8 = f1false() || f1false();
        testLeftShift();
        testRightShift();
        testUnsignedRightShift();
    }
}
