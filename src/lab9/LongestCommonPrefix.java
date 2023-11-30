package lab9;

/**
 * @author Aleksandra Łabęda
 */

/**
 * A function returns longest common prefix between Strings from a given list
 */
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String [] arr) {
        //check if array is not empty
        if (arr.length == 0)
            return "";
        //set suspected prefix to be the first value from given array
        String prefix = arr[0].toLowerCase();

        //iterate over the rest of the array
        for (int i = 1; i < arr.length; i++) {
            //for each value from an array check if a suspected prefix is
            //a prefix of a particular String
            while (arr[i].toLowerCase().indexOf(prefix) != 0) {
                //if is not a prefix, keep changing the length of the
                //prefix until it is equal to the one in the array
                prefix = prefix.substring(0, prefix.length()-1);
            }
        //the longest common prefix of all strings is for sure not longer
        // than the prefix of any two given strings
        }

        return prefix;
    }
}
