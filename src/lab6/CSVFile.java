package lab6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksandra Łabęda,
 * Bartosz Czerwiński
 */

public class CSVFile {
    /**
     * The list of rows read from a file. Each row consists
     * of a table of String values representing the actual
     * value from CSV.
     */
    private List<String[]> rows = new ArrayList<>();
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
    @Override
    public String toString() {
// Write your code here
        return null;
    }
    public static void main(String[] args) {
        CSVFile csvFile = new CSVFile("lab6/dane.csv", ",");
        System.out.println("Read CSV File:");
        System.out.println(csvFile);

        // Zapis do innego pliku z nowym separatorem
        csvFile.writeCSVFile("output.csv", ";");
        System.out.println("Write CSV File with a different separator.");

    }
}
