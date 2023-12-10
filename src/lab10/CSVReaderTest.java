package lab10;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CSVReaderTest {

    // Test for reading a valid CSV file with proper content
    @Test
    void testReadValidCSV() throws IOException, NoColumnCaptionException, InconsistentColumnNumberException, InvalidCSVFileException {
        CSVReader csvReader = new CSVReader("src\\valid.csv", ",");
        List<String[]> result = csvReader.read();

        assertNotNull(result);
        assertEquals(3, result.size());
        assertArrayEquals(new String[]{"John", "25", "New York"}, result.get(0));
        assertArrayEquals(new String[]{"Alice", "30", "London"}, result.get(1));
        assertArrayEquals(new String[]{"Bob", "28", "San Francisco"}, result.get(2));
    }

    // Test for reading an empty CSV file
    @Test
    void testReadEmptyFile() {
        try {
            CSVReader csvReader = new CSVReader("src\\empty.csv", ",");
            List<String[]> result = csvReader.read();

            assertNotNull(result);
            assertTrue(result.isEmpty());
        } catch (IOException | NoColumnCaptionException | InconsistentColumnNumberException |
                 InvalidCSVFileException e) {
            e.printStackTrace(); // Handle or log the exception as needed
        }
    }

    // Test for handling a CSV file without column names
    @Test
    void testReadFileWithEmptyColumnName() {
        CSVReader csvReader = new CSVReader("src\\no_column_names.csv", ",");

        assertThrows(NoColumnCaptionException.class, () -> csvReader.read());
    }

    // Test for handling inconsistent number of columns in a CSV row
    @Test
    void testReadInconsistentColumns() {
        CSVReader csvReader = new CSVReader("src\\inconsistent_columns.csv", ",");

        assertThrows(InconsistentColumnNumberException.class, () -> csvReader.read());
    }

    // Test for handling a file with an invalid CSV extension
    @Test
    void testReadInvalidCSVExtension() {
        CSVReader csvReader = new CSVReader("src\\invalid_extension.txt", ",");

        assertThrows(InvalidCSVFileException.class, () -> csvReader.read());
    }

    // Additional test for handling a non-existent file
    @Test
    void testReadNonExistentFile() {
        CSVReader csvReader = new CSVReader("src\\non_existent_file.csv", ",");

        assertThrows(IOException.class, () -> csvReader.read());
    }
}


