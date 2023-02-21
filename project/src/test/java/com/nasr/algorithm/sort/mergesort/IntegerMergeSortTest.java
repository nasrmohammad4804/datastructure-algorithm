package com.nasr.algorithm.sort.mergesort;

import com.nasr.algorithm.sort.MergeSort;
import com.nasr.algorithm.sort.Sortable;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class IntegerMergeSortTest {

    private Sortable<Integer> sortable;
    @BeforeEach
    void setUp() {
        sortable=  new MergeSort<>();
    }

    @Test
    @DisplayName("this unit test for sort integer number with merge sort algorithm")
    void itShouldSort() {
        // given
        Integer[] array ={7, 6, 3, 14};
        // when
        sortable.sort(array);
        //then

        assertArrayEquals(new Integer[] {3,6,7,14}, array);
    }
}