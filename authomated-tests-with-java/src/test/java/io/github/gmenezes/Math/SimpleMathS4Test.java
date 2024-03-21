package io.github.gmenezes.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleMathS4Test {

    @Test
    @DisplayName("6.4 + 2.0 = 8.4")
    void testSum(){
        //Given --- Arrange
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.4D;
        Double secondNumber = 2.0D;
        Double expected = 8.4D;

        //When --- Act
        Double actual = math.sum(firstNumber, secondNumber);

        //Then --- Assert
        Assertions.assertEquals(expected, actual,
                () -> firstNumber + " + " + secondNumber + " did not produce " + expected);

    }
    @Test
    @DisplayName("6.4 - 2.0 = 4.4")
    //estSubtraction_When_SixDotFour_Minus_TwoDotZero_ShouldReturFourDotFour
    void testSubtraction(){
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
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
        SimpleMath math = new SimpleMath();
        Double firstNumber = 6.4D;
        Double actual = math.squareRoot(firstNumber);
        Double expected = 2.5298221281347035D;
        Assertions.assertEquals(expected, actual,
                () -> " The square root of " + firstNumber + " did not produce " + expected);

    }
}
