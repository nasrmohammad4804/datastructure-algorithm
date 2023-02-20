package com.nasr.algorithm.sort;

public class   InsertionSort<E extends Comparable<E>> {

     public void sort(E[] elements) {
          if (isArrayContainSingleElement(elements))
               throw new IllegalStateException("you have array with single element . doesnt need to be sorted .");

          int startPosition = 1;


          while (startPosition < elements.length) {
               int index = startPosition;

               for (int counter = index - 1; counter >= 0; counter--) {


                    if (elements[counter].compareTo(elements[index]) > 0) {
                         swap(index, counter, elements);
                         index--;
                    } else break;

               }
               startPosition++;
          }
     }


     private boolean isArrayContainSingleElement(E[] elements) {
          return elements.length == 1;
     }
     private void swap(int firstElementPosition, int secondElementPosition, E[] elements) {
          E temp = elements[firstElementPosition];
          elements[firstElementPosition] = elements[secondElementPosition];
          elements[secondElementPosition] = temp;
     }

}
