package com.nasr.algorithm.sort;

import java.util.Arrays;

import static java.lang.System.*;

public class MergeSort<E extends Comparable<E>> implements Sortable<E> {

    @Override
    public void sort(E[] elements) {

        E[] copyElements = Arrays.copyOf(elements, elements.length);

        Comparable<E>[] sortedData = mergeSort(copyElements, copyElements.length);

        copySortedArrayToSpecificArray(elements, sortedData);
    }

    private void copySortedArrayToSpecificArray(E[] elements, Comparable<E>[] sortedData) {
        for (int index = 0; index < sortedData.length; index++) {
            elements[index] = (E) sortedData[index];
        }
    }


    @SuppressWarnings("unchecked")
    private Comparable<E>[] mergeSort(Comparable<E>[] element, int number) {
        if (number == 1)
            return element;

        int middle = number / 2;

        Comparable<E>[] leftArray = new Comparable[middle];


        Comparable<E>[] rightArray = new Comparable[number - middle];

        arraycopy(element, 0, leftArray, 0, middle);

        arraycopy(element, middle, rightArray, 0, number - middle);

        leftArray = mergeSort(leftArray, middle);
        rightArray = mergeSort(rightArray, number - middle);

        return merge(leftArray, rightArray);
    }

    /**
     * in this method we merge two sorted array into one sorted array
     * at first check pointer of every one if less than another one then put on final array
     * and compare element corresponding pointer with another array
     */
    @SuppressWarnings("unchecked")
    private Comparable<E>[] merge(Comparable[] leftArray, Comparable[] rightArray) {

        int totalSize = leftArray.length + rightArray.length;

        Comparable<E>[] elements = new Comparable[totalSize];

        int leftPosition = 0;
        int rightPosition = 0;
        int index = 0;

        while (true) {

            if (leftPosition == leftArray.length) {
                arraycopy(rightArray, rightPosition, elements, index, getLength(rightArray.length, rightPosition));
                break;
            } else if (rightPosition == rightArray.length) {
                arraycopy(leftArray, leftPosition, elements, index, getLength(leftArray.length, leftPosition));
                break;
            }

            if (leftArray[leftPosition].compareTo(rightArray[rightPosition]) <= 0) {
                elements[index++] = leftArray[leftPosition];
                leftPosition++;
            } else if (rightArray[rightPosition].compareTo(leftArray[leftPosition]) < 0) {
                elements[index++] = rightArray[rightPosition];
                rightPosition++;
            }
        }

        return elements;
    }

    private int getLength(int size, int startPosition) {
        return size - startPosition;
    }
}
