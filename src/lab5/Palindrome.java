package lab5;
/**
 * @author Aleksandra Łabęda,
 */

import java.util.Hashtable;

public class Palindrome {
    /**
     * original text of the palindrome
     * readable for human
     */
    private String palindrome = null;
    private String rawPalindrome = null;
    // Licznik wywołań metody findLongestPalindrome
    public static int findLongestPalindromeCounter = 0;
    // Licznik wywołań metody analyzeSubstring
    public static int analyzeSubstringCounter = 0;
    // Licznik wywołań metody isPalindrome
    public static int isPalindromeCounter = 0;

    public Palindrome(String palindrome) {

        this.palindrome = palindrome;
        this.rawPalindrome = makeRawPalindrome(palindrome);
    }
    /**
     *  text of the palindrome without spaces and other
     *  signs that are not letters, for comparing palindromes
     */


    /**
     * @return original version of palindrome
     */
    public String getPalindrome() {
        // Write you code here
        return palindrome;
    }

    /**
     * @return version of palindrome without additional signs
     */
    public String getRawPalindrome() {
        // Write you code here
        return rawPalindrome;
    }

    /**
     * @return makes version of palindrome without additional signs
     */
    public String makeRawPalindrome(String palindrome) {
        if (palindrome == null) {
            return null; // Handle null
        }

        StringBuilder rawPalindromeBuilder = new StringBuilder();
        for (char ch : palindrome.toCharArray()) {
            if (Character.isLetter(ch)) {
                rawPalindromeBuilder.append(ch);
            }
        }

        return rawPalindromeBuilder.toString();
    }

    @Override
    public String toString() {

        return palindrome;
    }

    @Override
    public boolean equals(Object anObject) {
        // Sprawdzamy, czy obiekt jest równy samemu sobie
        if (this == anObject) {
            return true;
        }

        // Sprawdzamy, czy obiekt nie jest nullem
        if (anObject == null) {
            return false;
        }

        // Sprawdzamy, czy obiekt anObject jest instancją klasy Palindrome
        if (!(anObject instanceof Palindrome)) {
            return false;
        }

        // Konwertujemy obiekt anObject na Palindrome
        Palindrome otherPalindrome = (Palindrome) anObject;

        // Porównujemy tekst palindromów
        if (this.getRawPalindrome() == null && otherPalindrome.getRawPalindrome() == null) {
            return true; // Oba palindromy są nullem, więc uważamy je za równe
        } else if (this.getRawPalindrome() != null) {
            return this.getRawPalindrome().equals(otherPalindrome.getRawPalindrome());
        } else {
            return false; // Jedno z palindromów jest nullem, więc uważamy je za różne
        }
    }


    @Override
    public int hashCode() {
        if (palindrome == null) {
            return 0;
        }
        return palindrome.hashCode();
    }


    public static void main(String[] args) {
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
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println("longestPalindrome: " + longestPalindrome);

        Palindrome p4 = new Palindrome("jajjaj");
        Palindrome p5 = new Palindrome("kamil slimak");

        System.out.println("p1.findLongestPalindromeCounter: " + p4.findLongestPalindromeCounter);
        System.out.println("p2.findLongestPalindromeCounter: " + p5.findLongestPalindromeCounter);
// recommended static field reference:
        System.out.println("Palindrome.findLongestPalindromeCounter: " + Palindrome.findLongestPalindromeCounter);
        System.out.println("p1.analyzeSubstringCounter: " + p4.analyzeSubstringCounter);
        System.out.println("p2.analyzeSubstringCounter: " + p5.analyzeSubstringCounter);


        Palindrome p6 = new Palindrome("jajjaj");
        Palindrome p7 = new Palindrome("A man, a plan, a canal, Panama");
        Palindrome p8 = new Palindrome("Evil eras roar, reviled." +
                "Red roses sit on." +
                "Newt, Santa at rat, Santa won." +
                "Now on a known light," +
                "wings white," +
                "dip red stars and no." +
                "Shine down on me." +
                "Live, Don, evil.");

        findLongestPalindrome(p6.getRawPalindrome());
        System.out.println("p6.findLongestPalindromeCounter: " + p6.findLongestPalindromeCounter);
        System.out.println("p6.analyzeSubstringCounter: " + p6.analyzeSubstringCounter);
        System.out.println("p6.isPalindromeCounter: " + p6.isPalindromeCounter);

        findLongestPalindrome(p7.getRawPalindrome());
        System.out.println("p7.findLongestPalindromeCounter: " + p7.findLongestPalindromeCounter);
        System.out.println("p7.analyzeSubstringCounter: " + p7.analyzeSubstringCounter);
        System.out.println("p7.isPalindromeCounter: " + p7.isPalindromeCounter);

        findLongestPalindrome(p8.getRawPalindrome());
        System.out.println("p8.findLongestPalindromeCounter: " + p8.findLongestPalindromeCounter);
        System.out.println("p8.analyzeSubstringCounter: " + p8.analyzeSubstringCounter);
        System.out.println("p8.isPalindromeCounter: " + p8.isPalindromeCounter);
    }

    //O(n^3) checking all possible substrings
    public static String findLongestPalindrome(String word) {
        findLongestPalindromeCounter++;
        String current = "";
        String longestPalindrome = "";
        if (word == null) return null;
        for (int i = 0; i < word.length(); i++) {
            String subword = word.substring(i, word.length());
            current = analyzeSubstring(subword);
            if (current.length() > longestPalindrome.length()) {
                longestPalindrome = current;
            }
        }
        return longestPalindrome;

    }

    public static String analyzeSubstring(String word) {
        analyzeSubstringCounter++;
        if (word == null) return null;
        int index = word.length();
        String substring = "";
        while (index > 0) {
            substring = word.substring(0, index);
            if (isPalindrome(substring)) {
                return substring;
            } else {
                index--;
            }
        }
        return "";
    }

    public static boolean isPalindrome(String word) {
        isPalindromeCounter++;
        if (word == null) return false;
        int i1 = 0, i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i2) != word.charAt(i1)) {
                return false;
            }
            i2--;
            i1++;
        }
        return true;
    }

    //O(n^2)
    //looping through each index and expanding form these points
    public static String findLongestPalindrome2(String word) {
        //if string is empty i return "" suggesting there
        //is no substring
        if (word == null || word.isEmpty()) {
            return "";
        }

        //boundaries that are going to lead to final substring
        int start = 0;
        int end = 0;

        for (int i = 0; i < word.length(); i++) {
            //handling 2 cases, even and odd
            //len1 => odd
            //len2 => even
            int len1 = expandAroundCenter(word, i, i);
            int len2 = expandAroundCenter(word, i, i + 1);
            int len = Math.max(len1, len2);
            /*
            len1 starts expanding from one letter in a  middle
            len2 starts expanding from 2 letters in a middle
             */

            //nif new longest palindrome was found
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return word.substring(start, end + 1);
    }

    public static int expandAroundCenter(String word, int left, int right) {
        //returns length of a palindrome after expanding it
        int L = left;
        int R = right;
        //if the string is null or the boundaries are wrong return 0 as length
        if (word == null || left > right)
            return 0;

        //we start from the middle and as long as characters are the same
        //on both sides of a string, we keep expanding indexes to the left
        //and to the right
        //=> expanding boundaries
        while (L >= 0 && R < word.length() && word.charAt(L) == word.charAt(R)) {
            L--;
            R++;
        }
        //difference between indexes + 1 cuz it gives proper length of a word
        return R - L - 1;
    }
}