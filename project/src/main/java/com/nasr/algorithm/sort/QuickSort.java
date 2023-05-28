package com.nasr.algorithm.sort;

public class QuickSort<E extends Comparable<E>> implements Sortable<E> {

    @Override
    public void sort(E[] elements) {

        final int startIndex=0;
        final int lastIndex=elements.length-1;

        sort(elements, startIndex,lastIndex);
    }

    private void sort(E[] element, int start, int end) {

        if (start < end) {
            int result = partition(element, start, end);
            sort(element, start, result - 1);
            sort(element, result + 1, end);
        }
    }

    private int partition(E[] elements, int start, int end) {


        int middle = (end + start) / 2;

        E pivot = elements[middle];

        while (start < end) {

            while (elements[end].compareTo(pivot) > 0)
                end--;

            while (elements[start].compareTo(pivot) < 0)
                start++;

            if (elements[end].equals(elements[start]))
                break;

            if (start < end)
                swap(elements, start, end);

        }
        return start;
    }

    private void swap(E[] elements, int firstIndex, int secondIndex) {
        E temp = elements[firstIndex];
        elements[firstIndex] = elements[secondIndex];
        elements[secondIndex] = temp;
    }
}