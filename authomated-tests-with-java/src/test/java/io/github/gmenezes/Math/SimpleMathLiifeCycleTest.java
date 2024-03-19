package io.github.gmenezes.Math;

import org.junit.jupiter.api.*;

public class SimpleMathLiifeCycleTest {

    SimpleMath math;
    Double firstNumber;
    Double secondNumber;
    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
        firstNumber = 6.4D;
        secondNumber = 2.0D;
        System.out.println("Running BeforeEach method!");
    }

    @AfterEach
   void afterEachMethod() {
        System.out.println("Running @AfterEach method!");
    }

    @Test
    @DisplayName("6.4 + 2.0 = 8.4")
    //testSum_When_SixDotFour_Plus_TwoDotZero_ShouldReturnEightDotFour
    void testSum(){
        System.out.println("6.4 + 2.0 = 8.4");

        Double firstNumber = 6.4D;
        Double secondNumber = 2.0D;
        Double actual = math.sum(firstNumber, secondNumber);
        Double expected = 8.4D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " + " + secondNumber + " did not produce " + expected);

    }
    @Test
    @DisplayName("6.4 - 2.0 = 4.4")
    //estSubtraction_When_SixDotFour_Minus_TwoDotZero_ShouldReturFourDotFour
    void testSubtraction(){
        System.out.println("6.4 - 2.0 = 4.4");

        Double firstNumber = 6.4D;
        Double secondNumber = 2.0D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        Double expected = 4.4D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " - " + secondNumber + " did not produce " + expected);

    }

    @Test
    @DisplayName("6.4 * 2.0 = 12.8")
    //testMultiplication_When_SixDotFour_Times_TwoDotZero_ShouldReturnTwelveDotEight
    void testMultiplication(){
        System.out.println("6.4 * 2.0 = 12.8");
        Double firstNumber = 6.4D;
        Double secondNumber = 2.0D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        Double expected = 12.8D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " * " + secondNumber + " did not produce " + expected);

    }

    @Test
    @DisplayName("6.4 / 2.0 = 3.2")
    //testDivision_When_SixDotFour_Divided_TwoDotZero_ShouldReturnThreeDotTwo
    void testDivision(){
        System.out.println("6.4 / 2.0 = 3.2");
        Double firstNumber = 6.4D;
        Double secondNumber = 2.0D;
        Double actual = math.division(firstNumber, secondNumber);
        Double expected = 3.2D;
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected);

    }

    @Test
    @DisplayName("(6.4 + 2.0) / 2 = 4.2")
    void testMean(){
        System.out.println("(6.4 + 2.0) / 2 = 4.2");
        Double firstNumber = 6.4D;
        Double secondNumber = 2.0D;
        Double actual = math.mean(firstNumber, secondNumber);
        Double expected = 4.2D;
        Assertions.assertEquals(expected, actual,
                () -> "The mean between " + secondNumber + " and " + firstNumber+  " did not produce " + expected);

    }

    @Test
    @DisplayName("6.4 ^ 1/2  = 2.5298221281347035")
    //testSquareRoot_When_SquareRootOf_SixDotFour_ShouldReturn_2_5298221281347035D
    void testSquareRoot(){
        System.out.println("6.4 ^ 1/2  = 2.5298221281347035");
        Double firstNumber = 6.4D;
        Double actual = math.squareRoot(firstNumber);
        Double expected = 2.5298221281347035D;
        Assertions.assertEquals(expected, actual,
                () -> " The square root of " + firstNumber + " did not produce " + expected);

    }
}
