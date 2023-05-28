package com.nasr.algorithm.sort.quicksort;

import com.nasr.algorithm.sort.QuickSort;
import com.nasr.algorithm.sort.Sortable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntegerQuickSortTest {

    private Sortable<Integer> sortable;
    @BeforeEach
    void setUp() {
        this.sortable= new QuickSort<>();
    }

    @Test
    void itShouldSortWithRepeatedNumber() {
        // given
        Integer[] numbers= {4,5,1,7,8,9,7,3,2};
        // when
        sortable.sort(numbers);
        //then
        System.out.println(Arrays.toString(numbers));

        assertArrayEquals(new Integer[] {1,2,3,4,5,7,7,8,9}, numbers);
    }
    @Test
    void itShouldSortWithoutRepeatedNumber() {
        // given
        Integer[] numbers= {1,5,6,2,3,9,-2,4,11,7,10,8};
        // when
        sortable.sort(numbers);
        //then
        System.out.println(Arrays.toString(numbers));

        assertArrayEquals(new Integer[] {-2,1,2,3,4,5,6,7,8,9,10,11}, numbers);
    }
}