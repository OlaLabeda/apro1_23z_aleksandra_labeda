package lab5;
import java.util.Hashtable;

/**
 * @author Aleksandra Łabęda,
 */

public class Palindrome {
    /**
     * original text of the palindrome readable for human
     */
    private String palindrome = null;
    /**
     * modified text of the palindrome without characters other than letters
     */
    private String rawPalindrome = null;
    /**
     * counter of all calls of method findLongestPalindrome
     */
    public static int findLongestPalindromeCounter = 0;
    /**
     * counter of all calls of method analyzeSubstringCounter
     */
    public static int analyzeSubstringCounter = 0;
    /**
     * counter of all calls of method isPalindromeCounter
     */
    public static int isPalindromeCounter = 0;

    public Palindrome(String palindrome) {

        this.palindrome = palindrome;
        this.rawPalindrome = makeRawPalindrome(palindrome);
    }

    /**
     * @return original version of palindrome
     */
    public String getPalindrome() {
        return palindrome;
    }

    /**
     * @return version of palindrome made out of letters only
     */
    public String getRawPalindrome() {
        return rawPalindrome;
    }

    /**
     * @return makes version of palindrome without signs other than letters
     * to make comparing palindromes easier
     */
    public String makeRawPalindrome(String palindrome) {
        if (palindrome == null) {
            return null; // Handle null
        }

        StringBuilder rawPalindromeBuilder = new StringBuilder();
        //iterating over elements of String modified to be a char array
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
        //checking if an object is equal to itself
        //(reference to the same object)
        if (this == anObject) {
            return true;
        }

        //checking if object is not null or if anObject is an instance of a Palindrome class
        if (anObject == null || !(anObject instanceof Palindrome))  {
            return false;
        }

        //casting the 'anObject' to 'Palindrome' in order to access the 'getRawPalindrome()' method

        /*
        *When passing a reference to an object as a method argument, in this case as 'Object anObject,'
        * the 'equals' method doesn't know the exact type of the object. Therefore, to use the methods
        * and fields of a specific type, you need to cast the object to the appropriate type if there
        * is certainty that it is the correct type.
        * */
        Palindrome otherPalindrome = (Palindrome) anObject;

        //comparing the text of palindromes
        if (this.getRawPalindrome() == null && otherPalindrome.getRawPalindrome() == null) {
            return true; // Oba palindromy są nullem, więc uważamy je za równe
        } else if (this.getRawPalindrome() != null) {
            return this.getRawPalindrome().equals(otherPalindrome.getRawPalindrome());
        } else {
            return false; // one of palindromes is null so it's different
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


        Palindrome p6 = new Palindrome("Ala");
        Palindrome p7 = new Palindrome("A racecar won. It's a radar");
        Palindrome p8 = new Palindrome("The sun sets, and the sky turns dark. Stars twinkle, " +
                "and the night is quiet. A bat flies, and an owl hoots. The moon shines, and the world sleeps. " +
                "It's a calm night, full of peace and serenity. Yet, in the dark, a rat scurries. It's not alone; " +
                "a cat is near. The chase begins, a race in the night. Shadows move, and the hunt is on. In the end, " +
                "it's the cat's victory. A purr, a satisfied cat, and the night resumes its tranquility.");

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

    /**
     * @return longest palindromic substring of a given string
     */
    public static String findLongestPalindrome(String word) {
        findLongestPalindromeCounter++;
        String current = "";
        word = word.toLowerCase();
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
    /**
     * @return analyzing substrings of a substring
     * to check if there's a palindrome
     */
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

    /**
     * @return simply checking if a String is a palindromic sequence
     */
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