package lab5;
/**
 * @author Aleksandra Łabęda,
 */

public class Palindrome {
    public static void main(String[] arguments) {
        String word = "abbcd";
        String longestPalindrome = findLongestPalindrome2(word);
        System.out.println(longestPalindrome);
    }

    //O(n^3) checking all possible substrings
    public static String findLongestPalindrome(String word) {
        String current = "";
        String longestPalindrome = "";
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