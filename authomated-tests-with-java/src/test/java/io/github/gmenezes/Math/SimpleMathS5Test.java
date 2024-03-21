package io.github.gmenezes.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleMathS5Test {

    SimpleMath math;
    Double firstNumber;
    Double secondNumber;


    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        firstNumber = 6.4D;
        secondNumber = 2.0D;
        System.out.println("Running BeforeEach method!");
    }


    @DisplayName("usando o MethodSource")
    @ParameterizedTest
    @MethodSource("testDivisionParameters")
    void testDivision(double firstNumber, double secondNumber, double expected){
        Double actual = math.division(firstNumber, secondNumber);

        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected);

    }

    public static Stream<Arguments> testDivisionParameters() {
        return Stream.of(
                Arguments.of(6.4D, 2D, 3.2D),
                Arguments.of(4.5D, 1.5D, 3.0D),
                Arguments.of(1.74D, 0.3D, 5.8D)
        );
    }

    @DisplayName("Usando o CSVSource in line")
    @ParameterizedTest
    @CsvSource({
            "6.4, 2, 3.2",
            "4.5, 1.5, 3.0",
            "1.74, 0.3, 5.8"
    })
    void testDivisionCsv(double firstNumber, double secondNumber, double expected){
        System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber, secondNumber);
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected);

    }

    @DisplayName("Usando o CsvSource com um arquivo")
    @ParameterizedTest
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivisionCsvFile(double firstNumber, double secondNumber, double expected){
        System.out.println("Test " + firstNumber + " / " + secondNumber + " = " + expected);
        Double actual = math.division(firstNumber, secondNumber);
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Gibran", "Israelly", "Thales"})
    void testValueSource(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }


}
