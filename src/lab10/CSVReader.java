package lab10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aleksandra Łabęda
 */
/**
 * CSVReader class allows reading data from CSV file
 */
public class CSVReader {
    private List<String[]> rows = new ArrayList<>();
    private String fileName;
    private String separator;

    /**
     * CSV Reader constructor class
     * @param fileName name of file to be read
     * @param separator separator used to separate columns in a csv file
     */
    public CSVReader(String fileName, String separator) {
        this.fileName = fileName;
        this.separator = separator;
    }

    /**
     * read method reads data from csv file and returns it as a list of String arrays
     * @return
     */
    public List<String[]> read() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            // checking if a file has .csv extention
            if (!fileName.toLowerCase().endsWith(".csv")) {
                throw new InvalidCSVFileException("File is not a valid CSV file");
            }

            //read first line which should contain column names
            String firstLine = br.readLine();
            if (firstLine == null) {
                throw new NoColumnCaptionException("Empty file");
            }
            //first  line divided into column names using separator
            String[] columnNames = firstLine.split(separator);
            if (columnNames.length == 0) {
                throw new NoColumnCaptionException("No column names in the first row");
            }

            int expectedColumnCount = columnNames.length;
            //checking if each column is not empty
            for (String columnName : columnNames) {
                if (columnName.isEmpty()) {
                    throw new NoColumnCaptionException("Empty column name in the first row");
                }
            }
            //reading vrows from files and dividing them using separator
            String line;
            while ((line  = br.readLine()) != null) {
                String[] rowData = line.split(separator);

                if (rowData.length != expectedColumnCount) {
                    throw new InconsistentColumnNumberException("Inconsistent number of columns in a row");
                }
                //appends a result array
                rows.add(rowData);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        catch (NoColumnCaptionException ncce) {
            ncce.printStackTrace();
        } catch (InconsistentColumnNumberException icne) {
            icne.printStackTrace();
        } catch (InvalidCSVFileException icsvfe) {
            icsvfe.printStackTrace();
        }

        return rows;
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

    /**
     * main method creates csvreader object, reads data form file
     * and prints it on the screen
     * @param args
     */
    public static void main(String[] args) {
        CSVReader csvReader = new CSVReader("src\\username.csv", ";");
        System.out.println(csvReader.read());
        System.out.println(csvReader);

    }
}

/**
 * represents situation when there is no column names in csv file
 */
class NoColumnCaptionException extends Exception {
    public NoColumnCaptionException(String message) {
        super(message);
    }
}
/**
 * represents situation when number of columns in a row is not compatible with expected value
 */
class InconsistentColumnNumberException extends Exception {
    public InconsistentColumnNumberException(String message) {
        super(message);
    }
}

/**
 * represents a situation when a file is not a proper csv file
 */
class InvalidCSVFileException extends Exception {
    public InvalidCSVFileException(String message) {
        super(message);
    }
}