package lab10;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

/**
 * a class containing oftwo simple tests for Sample class methods
 */
public class SampleTest {
    @Test
    public void divideBasicDoubleTest()  {
        Sample sample = new Sample();
        double result = sample.divide(5.0, 2.0);
        double expected = 2.5;
        // check if the results is equal to expected value with a tolerance of 0.001
        Assert.assertEquals(expected, result, 0.001);
    }

    @Test
    public void divideBasicIntTest() {
        Sample sample = new Sample();
        int result = sample.divide(5, 2);
        int expected = 2;

        // Sprawdzamy, czy wynik jest równy oczekiwanej wartości
        assertEquals(expected, result);
    }

}