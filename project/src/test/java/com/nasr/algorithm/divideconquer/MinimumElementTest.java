package com.nasr.algorithm.divideconquer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static java.lang.String.valueOf;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumElementTest {

    private MinimumElement<Integer> minimumElement;

    @BeforeEach
    void setUp() {
        minimumElement = new MinimumElement<>();
    }


    @ParameterizedTest
    @MethodSource(value = "integerArrayProvider")
    @DisplayName(value = "find minimum element based on position if dont find we expected null otherwise corresponding value")
    void itShouldFindMinimumElementBaseOnPosition(Integer[] array, String expected, int position) {
        // given
        // when

        String actual = minimumElement.findMinimumElementBaseOnPosition(array, position);
        //then
        assertThat(actual).isEqualTo(expected);

    }

    public static Stream<Arguments> integerArrayProvider() {

        Integer[] array = {6, 10, 13, 5, 8, 3, 2, 11};
        return Stream.of(
                Arguments.of(array, null, 0),
                Arguments.of(array, null, -2),
                Arguments.of(array, null, 10),
                Arguments.of(array, "2", 1),
                Arguments.of(array, "3", 2),
                Arguments.of(array, "5", 3),
                Arguments.of(array, "6", 4),
                Arguments.of(array, "8", 5),
                Arguments.of(array, "10", 6),
                Arguments.of(array, "11", 7),
                Arguments.of(array, "13", 8)
        );
    }
}