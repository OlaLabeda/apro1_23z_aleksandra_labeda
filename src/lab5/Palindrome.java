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
        return this.palindrome;
    }
    /**
     * @return version of palindrome without additional signs
     */
    public String getRawPalindrome() {
        // Write you code here
        return this.rawPalindrome;
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

        return this.palindrome;
    }


    @Override
    public boolean equals(Object anObject) {
// Write your code here
        return true;
    }

    @Override
    public int hashCode() {
    // Write your code here
        return 1;
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


        Palindrome p4 = new Palindrome("ala");
        Palindrome p5 = new Palindrome("Szybki lis skacze po gorach");
        Palindrome p6 = new Palindrome("W deszczowy dzien spacerujnc po lesie " +
                "natkneliśmy sie na ukryta w gaszczu chatke, ktora porastaly dzikie winorosnie. " +
                "Wnetrze okazalo sie niezwykle – pelne tajemniczych artefaktow i starych ksiag. " +
                "Zagubilismy sie w tych zapomnianych historiach, gdzie czas wydawal sie zatrzymany. " +
                "Po kilku godzinach wrocilismy do rzeczywistosci z usmiechem na twarzach, gotowi na dalsza " +
                "podroz przez to magiczne miejsce");

        // Testowanie złożoności
        p4.makeRawPalindrome(p4.getPalindrome());
        p5.makeRawPalindrome(p5.getPalindrome());
        p6.makeRawPalindrome(p6.getPalindrome());
System.out.println(p4.getPalindrome());

        findLongestPalindrome(p4.getRawPalindrome());
        System.out.println("findLongestPalindromeCounter: " + findLongestPalindromeCounter);

        analyzeSubstring(p4.getRawPalindrome());
        System.out.println("analyzeSubstringCounter: " + analyzeSubstringCounter);

        isPalindrome(p4.getRawPalindrome());
        System.out.println("isPalindromeCounter: " + isPalindromeCounter);





    }

    //O(n^3) checking all possible substrings
    public static String findLongestPalindrome(String word) {
        findLongestPalindromeCounter++;
        String current = "";
        String longestPalindrome = "";
        if (word == null) return null;
        int index = 0;
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