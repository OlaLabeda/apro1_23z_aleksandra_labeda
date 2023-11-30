package lab9;
import java.util.Arrays;
/**
 * @author Aleksandra Łabęda
 */
/**
 * A function returns longest common prefix between Strings from a given list
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] arr) {
        //check if array is not empty
        int size = arr.length;
        if (size == 0)
            return "";
        if (size == 1)
            return arr[0];
        //sort array of strings
        Arrays.sort(arr);
        //find shorter one between the first and the last string from sorted array
        //if they have the same prefix the shorter one is going to be the prefix
        int min = Math.min(arr[0].length(), arr[size-1].length());
        //find longest prefix between first and last string cuz they are sorted
        //and if there's a common prefix between the first one and the last one
        //that means that is common between all other strings in a sorted array
        arr[0] = arr[0].toLowerCase();
        arr[size - 1] = arr[size - 1].toLowerCase();
        int iterate = 0;
        while (iterate < min && arr[0].charAt(iterate) == arr[arr.length-1].charAt(iterate)) {
            iterate++;
        }
        if (iterate == 0) return "";
        String prefix = arr[0].substring(0, iterate-1);
        return prefix;
    }
}
