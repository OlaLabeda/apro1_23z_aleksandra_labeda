package lab5;

import java.util.Hashtable;
/**
 * @author Aleksandra Łabęda,
 * Aleksandra Wasilewska
 */
public class PalindromeTest {
    public static void main(String[] args){
        Palindrome p1 = new Palindrome("kobyłamamałybok");
        Palindrome p2 = new Palindrome("kobyła ma mały bok!");
        Palindrome p3 = new Palindrome("elf układał kufle");
        System.out.println("p1 == p2 : " + (p1 == p2));
        System.out.println("p1.equals(p2) : " + p1.equals(p2));
        Hashtable<Palindrome, String> ps = new Hashtable<>();
        ps.put(new Palindrome("a car boso kokos obraca"), "Andrzej Pacierpnik");
        ps.put(p2, "autor nieznany");
        ps.put(new Palindrome("muzo, raz daj jad za rozum"), "Julian Tuwim");
        ps.put(p3, "Tadeusz Morawski");

        System.out.println("Autorem palindromu " + p3 + " jest " + ps.get(p3));
        String word = "rrrrr abccba kobyłamamałybok";

        Palindrome p4 = new Palindrome("jajjaj");
        Palindrome p5 = new Palindrome("kamil slimak");

        System.out.println("p1.findLongestPalindromeCounter: " + p4.findLongestPalindromeCounter);
        System.out.println("p2.findLongestPalindromeCounter: " + p5.findLongestPalindromeCounter);
// recommended static field reference:
        System.out.println("Palindrome.findLongestPalindromeCounter: " + Palindrome.findLongestPalindromeCounter);
        System.out.println("p1.analyzeSubstringCounter: " + p4.analyzeSubstringCounter);
        System.out.println("p2.analyzeSubstringCounter: " + p5.analyzeSubstringCounter);

        //longest palindrome of length 3, ala
        Palindrome p6 = new Palindrome("Ala");
        //longest palindrome of length 7, racecar
        Palindrome p7 = new Palindrome("A racecar won. It's a radar");
        //longest palindrome of length 5, tabat
        Palindrome p8 = new Palindrome("The sun sets, and the sky turns dark. Stars twinkle, " +
                "and the night is quiet. A bat flies, and an owl hoots. The moon shines, and the world sleeps. " +
                "It's a calm night, full of peace and serenity. Yet, in the dark, a rat scurries. It's not alone; " +
                "a cat is near. The chase begins, a race in the night. Shadows move, and the hunt is on. In the end, " +
                "it's the cat's victory. A purr, a satisfied cat, and the night resumes its tranquility.");

        p6.getLongestPalindromicSubstring();
        p7.getLongestPalindromicSubstring();
        p8.getLongestPalindromicSubstring();
        //for all given palindromes values of counter is going to be the same
        //because it was already called within Palindrome class
        System.out.println("p8.findLongestPalindromeCounter: " + p8.findLongestPalindromeCounter);
        System.out.println("p8.analyzeSubstringCounter: " + p8.analyzeSubstringCounter);
        System.out.println("p8.isPalindromeCounter: " + p8.isPalindromeCounter);
    }

}
