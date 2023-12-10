package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    private List<String[]> rows = new ArrayList<>();
    private String fileName;
    private String separator;

    public CSVReader(String fileName, String separator) {
        this.fileName = fileName;
        this.separator = separator;
    }

    public List<String[]> read() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                rows.add(line.split(separator));
            }
            return rows;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        rows.forEach(row -> {
            sb.append(String.join(":", row));
            sb.append(System.lineSeparator());
        });
        return sb.toString();
    }

    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("oscar_age_male.csv", ",");
        System.out.println(csvReader.read());
        System.out.println(csvReader);

    }
}
