package io.github.gmenezes.Math;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayCompareTest {

    @Test
    void testShould_Compare_The_Content_Between_Numbers_Excepted() {
        int[] numbers = {25, 8, 21, 3, 32};
        int[] expected = {3, 8, 21, 25, 32};

        Arrays.sort(numbers);

        assertArrayEquals(expected, numbers);
    }

    @Test
    @Timeout(1)
    void testSortPerformance() {
        int[] numbers = {25, 8, 21, 3, 32};
        for (int i = 0; i < 1000000000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }
    }
}
