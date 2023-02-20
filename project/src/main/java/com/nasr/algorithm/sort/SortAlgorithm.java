package com.nasr.algorithm.sort;

public class SortAlgorithm<E extends Comparable<E>> {

    private void swap(int firstElementPosition, int secondElementPosition, E[] elements) {
        E temp = elements[firstElementPosition];
        elements[firstElementPosition] = elements[secondElementPosition];
        elements[secondElementPosition] = temp;
    }
}
