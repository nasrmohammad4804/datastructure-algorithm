package com.nasr.algorithm.sort.insertionsort;

import com.nasr.algorithm.sort.InsertionSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IntegerInsertionSortTest {

    private InsertionSort<Integer> insertionSort ;
    @BeforeEach
    void setUp() {
        insertionSort= new InsertionSort<>();
    }

    @Test
    @DisplayName("this test for expect whenever we have 1 item in array throws illegalStateException")
    void itShouldThrowExceptionWhileSortingArrayContainSingleElement()  {
        // given
        Integer[] data = {7};

        // when
        //then
        assertThrows(IllegalStateException.class,() -> insertionSort.sort(data));

    }

    @Test
    @DisplayName("this test for sort integer array with ascending sortType in insertion sort")
    void itShouldSort()  {
        // given
        Integer[] data = {7, 5, 11, 4, 9, 8, 23, 17};
        // when

        insertionSort.sort(data);
        //then

        assertThat(data).isSorted();
    }

}