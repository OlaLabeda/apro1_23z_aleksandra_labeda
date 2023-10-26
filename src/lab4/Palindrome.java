package lab4;

public class Palindrome {
    public static void main(String[] arguments) {
        String word = "xkajaka";
        String longestPalindrome = findLongestPalindrome(word);
        System.out.println(longestPalindrome);
    }

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
            }
            else {
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
}