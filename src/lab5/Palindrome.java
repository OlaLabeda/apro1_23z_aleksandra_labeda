package lab5;
import java.util.Hashtable;

/**
 * @author Aleksandra Łabęda,
 * Aleksandra Wasilewska
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
     * longest palindromic substring
     */
    private String longestPalindromicSubstring = null;
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
    /**
     * Palindrme class construtor
     */
    public Palindrome(String palindrome) {

        this.palindrome = palindrome;
        this.rawPalindrome = makeRawPalindrome(palindrome);
        this.findLongestPalindrome();
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
     * @return longest palindromic substring
     */
    public String getLongestPalindromicSubstring() {
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
            return true; // both palindromes are null, so they are assumed to have the same value
        } else if (this.getRawPalindrome() != null) { //rawPalindrome is not null so the equality can be checked
            String oPalRaw = otherPalindrome.getRawPalindrome();
            String objRaw = this.getRawPalindrome();
            //comparing only letters without takng into consideration upper/lower case
            oPalRaw = oPalRaw.toLowerCase();
            objRaw = objRaw.toLowerCase();
            //length of both palindromes is different so they cant be the same
            if (objRaw.length() != oPalRaw.length()){
                return false;
            }
            else {
                for (int i = 0; i < objRaw.length(); i++){
                    if (objRaw.charAt(i) != oPalRaw.charAt(i)){
                        return false;
                    }
                }
                return true;
            }
        } else {
            return false; // one of palindromes is null so it's different
        }
    }

    @Override
    public int hashCode() {
        if (palindrome == null) {
            return 0;
        }
        return rawPalindrome.hashCode();
    }


    /**
     * @return longest palindromic substring of a given string
     */
    private String findLongestPalindrome() {
        String word = rawPalindrome;
        findLongestPalindromeCounter++;
        String current = "";
        word = word.toLowerCase();
        String longestPalindrome = "";
        if (word == null) return null;
        for (int i = 0; i < word.length(); i++) {
            String subword = word.substring(i, word.length());
            current = this.analyzeSubstring(subword);
            if (current.length() > longestPalindrome.length()) {
                longestPalindrome = current;
            }
        }
        longestPalindromicSubstring = longestPalindrome;
        return longestPalindrome;

    }
    /**
     * @return analyzing substrings of a substring
     * to check if there's a palindrome
     */
    private String analyzeSubstring(String word) {
        analyzeSubstringCounter++;
        if (word == null) return null;
        int index = word.length();
        String substring = "";
        while (index > 0) {
            substring = word.substring(0, index);
            if (this.isPalindrome(substring)) {
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
    private boolean isPalindrome(String word) {
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
