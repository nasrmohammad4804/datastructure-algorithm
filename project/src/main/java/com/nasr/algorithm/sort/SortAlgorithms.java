package com.nasr.algorithm.sort;

public class SortAlgorithms<E extends Comparable<E>> {


    public void swap(int firstElementPosition, int secondElementPosition, E[] elements) {
        E temp = elements[firstElementPosition];
        elements[firstElementPosition] = elements[secondElementPosition];
        elements[secondElementPosition] = temp;
    }
}