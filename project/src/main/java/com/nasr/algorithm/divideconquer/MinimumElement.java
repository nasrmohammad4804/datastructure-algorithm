package com.nasr.algorithm.divideconquer;

import com.nasr.algorithm.sort.SortAlgorithms;

/*this problem called selection problem
 * we want to find n minimum element on array if exists
 * we start 1 minimum element means when sort array first element -> min element at whole of array
 * and finally n minimum element means when sort array last element -> max element at whole of array
 * we don't use zero base and started from 1
 * we specify pivot and   use partitioning same as quick sort around pivot
 * */
public class MinimumElement<E extends Number & Comparable<E>> extends SortAlgorithms<E> {

    /**
     * @param array    that we want to find n minimum element
     * @param position as int . started from 1 and continued to n (length of array)
     * @return value at specific position if exists otherwise null
     */
    public String findMinimumElementBaseOnPosition(E[] array, int position) {

        int start = 0;
        int end = array.length - 1;

        return findMinimumElementBaseOnPosition(array, start, end, position);
    }

    public String findMinimumElementBaseOnPosition(E[] array, int start, int end, int position) {


        if (start < end) {
            int partitionedElementIndex = partition(array, start, end);

            int partitionedElementPosition = partitionedElementIndex + 1;

            if (partitionedElementPosition == position)
                return array[partitionedElementIndex].toString();

            else if (partitionedElementPosition < position)
                return findMinimumElementBaseOnPosition(array, partitionedElementIndex + 1, end, position);

            else
                return findMinimumElementBaseOnPosition(array, start, partitionedElementIndex - 1, position);
        }

        /*happens when we have 1 element, and we know that this element is same element at specific position*/
        if (start == end)
            return array[start].toString();

        /*if start greater than end means position value bigger than array.length or less or equal than 0 ( position <=0 || position>array.length)*/
        return null;

    }

    private int partition(E[] array, int start, int end) {
        E pivot = array[start];

        while (start < end) {

            while (array[end].compareTo(pivot) > 0)
                end--;

            while (array[start].compareTo(pivot) < 0)
                start++;

            if (start < end)
                swap(start, end, array);
        }
        swap(start, end, array);
        return end;
    }
}
