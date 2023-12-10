package lab10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.testng.Assert;
import org.testng.annotations.Test;


import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.testng.Assert.assertEquals;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertThrows;

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
         Assertions.assertEquals(expected, result, 0.001);
     }

     @Test
     public void divideBasicIntTest() {
         Sample sample = new Sample();
         int result = sample.divide(5, 2);
         int expected = 2;

         // checking if a result has a proper value
         Assert.assertEquals(expected, result);
     }
    //The @ParameterizedTest annotation marks a method as a parameterized test
    // => the test method will be executed for different sets of parameters
    @ParameterizedTest
    //The @MethodSource annotation points to the method that provides parameter sets
    // for the test => here it's integerValues()
    @MethodSource("integerValues")
    public void parametrizedDivideIntegersTest(int a, int b, int expected) {
        Sample sample = new Sample();
        int result = sample.divide(a, b);
        Assertions.assertEquals(expected, result);
    }


    @ParameterizedTest
    @MethodSource("doubleValues")
    public void parametrizedDivideDoublesTest(double a, double b, double expected) {
        Sample sample = new Sample();
        double result = sample.divide(a, b);
        Assertions.assertEquals(expected, result, 0.001);
    }

    // method providing arguments for tests with integers
    private static Stream<Arguments> integerValues() {
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(20, 4, 5),
                Arguments.of(15, 3, 5)
                // Dodaj więcej przypadków testowych, jeśli to konieczne
        );
    }

    // method providing arguments for tests with double values
    private static Stream<Arguments> doubleValues() {
        return Stream.of(
                Arguments.of(10.0, 3.0, 3.333),
                Arguments.of(15.0, 2.0, 7.5),
                Arguments.of(8.0, 2.5, 3.2)
                // Dodaj więcej przypadków testowych, jeśli to konieczne
        );
    }

    @Test
    public void testDivideByZeroException() {
        Sample sample = new Sample();

        // Test if dividing by zero generates arithmetic exception
        assertThrows(ArithmeticException.class, () -> {
            sample.divide(5, 0);
        });
    }

    @Test
    public void testDivideByZeroNoException() {
        Sample sample = new Sample();

        //test if dividing by a non-zero value doesnt generate any exception
        assertDoesNotThrow(() -> {
            sample.divide(5, 2);
        });
    }
}