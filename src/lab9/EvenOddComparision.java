package lab9;

import java.util.Locale;

/**
 * @author Aleksandra Łabęda
 */

public class EvenOddComparision {
    /**
     *
     * @param s1
     * @param s2
     * @return
     * function checking if after switching the order of letters on even indexes and
     * doing the same on odd indexes can give the same two strings
     */
    public static boolean evenOddComparision(String s1, String s2) {
        //if the length is different they'll not be the same no matter what
        if (s1.length() != s2.length())
            return false;
        // calculate occurences of even and odd numbers
        int[] evenOccurrences = new int[26];
        int[] oddOccurrences = new int[26];
        String sPom1 = s1.toLowerCase();
        String sPom2 = s2.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {
                evenOccurrences[sPom1.charAt(i)-'a']++;
                evenOccurrences[sPom2.charAt(i)-'a']--;
            } else {
                oddOccurrences[sPom1.charAt(i)-'a']++;
                oddOccurrences[sPom2.charAt(i)-'a']--;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (evenOccurrences[i] != 0)
                return false;
        }
        return true;
    }

}
