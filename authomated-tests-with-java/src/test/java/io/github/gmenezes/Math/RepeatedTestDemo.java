package io.github.gmenezes.Math;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RepeatedTestDemo {

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

    @DisplayName("Usando repeatedTest")
    @RepeatedTest(3)
    void testDivisionByZero(RepetitionInfo repetitionInfo, TestInfo testInfo){
        System.out.println("Repetition n. " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());

        System.out.println("Running " + testInfo.getTestMethod().get().getName() );
        var expectedMessage = "Impossible division by zero!";
        var actual = assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, 0D);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message");
    }

    @DisplayName("test2DivisionByZero")
    @RepeatedTest(value = 3, name = "{displayName}. Repetition " + "{currentRepetition} of {totalRepetitions}")
    void test2DivisionByZero(RepetitionInfo repetitionInfo, TestInfo testInfo){
        System.out.println("Repetition n. " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());

        System.out.println("Running " + testInfo.getTestMethod().get().getName() );
        var expectedMessage = "Impossible division by zero!";
        var actual = assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, 0D);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message");
    }

}
