package lab9;

/**
 * @author Aleksandra Łabęda
 */
public class LongestCommonPrefixTest {
    public static void main(String[] args) {
        String[] arr1 = {"jajo", "JAJecznica", "jablecznik"};
        String[] arr2 = {"jajo", "kolo", "BAJKI"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(arr1));
        System.out.println(LongestCommonPrefix.longestCommonPrefix(arr2));
    }
}
