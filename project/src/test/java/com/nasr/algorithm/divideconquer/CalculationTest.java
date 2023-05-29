package com.nasr.algorithm.divideconquer;

import org.junit.jupiter.api.Test;

import static com.nasr.algorithm.divideconquer.Calculation.multiply;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    @Test
    void itShouldMultiply() {
        // given
        long firstNumber= 65232415;
        long secondNumber= 412783;
        // when
        long result = multiply(firstNumber, secondNumber);
        //then

        assertThat(result).isEqualTo(26926831960945L);
    }
}