package lab6;

import java.io.*;
/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */

/**
 * Simple program to serialize palindrome and write it (serialize it) into the file.
 */

public class ReadPalindrome {
    /**
     * Writes the given palindrome into the file with the given name.
     */
    public static void read(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            Palindrome p = (Palindrome) ois.readObject();
            System.out.println("Read Palindrome: " + p.getPalindrome());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ReadPalindrome.read("palindrome.plr");
    }
}