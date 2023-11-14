package lab6;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */

public class CSVFile {
    @Override
    public String toString() {
        String sentence = "";
        for (String[] row : rows) {
                for (String element : row) {
                    sentence += element + " ";
                }
                sentence += "\n";
        }


        return sentence;
    }

    /**
     * The list of rows read from a file. Each row consists
     * of a table of String values representing the actual
     * value from CSV.
     */
    private ArrayList<String[]> rows = new ArrayList<>();
    /**
     * Reads given file as CSV with given separator
     * @param fileName the name of the CSV file to read.
     * @param separator the separator used in CSV file.
    4
     */
    public CSVFile(String fileName, String separator) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(separator);
                rows.add(values);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Writes the CSV data into the file.
     * @param fileName of a file to write.
     * @param separator to be used in written CSV.
     */
    public void writeCSVFile(String fileName, String separator) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (String[] row : rows) {
                String line = String.join(separator, row);
                writer.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plikWejsciowy;
        String plikWyjsciowy;
        String separatorWejscia;
        String separatorWyjscia;
        System.out.println("Podaj nazwe pliku wejsciowego: ");
        plikWejsciowy = scanner.next();
        System.out.println("Podaj nazwe pliku wyjsciowego: ");
        plikWyjsciowy = scanner.next();
        System.out.println("Podaj separator pliku wejsciowego: ");
        separatorWejscia = scanner.next();
        System.out.println("Podaj separator pliku wyjsciowego: ");
        separatorWyjscia = scanner.next();

        CSVFile csvFile = new CSVFile(plikWejsciowy, separatorWejscia);
        System.out.println("Read CSV File:");
        System.out.println(csvFile.toString());

        // Zapis do innego pliku z nowym separatorem
        csvFile.writeCSVFile(plikWyjsciowy, separatorWyjscia);
        System.out.println("Write CSV File with a different separator.");

    }
}
