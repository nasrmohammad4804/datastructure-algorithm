package com.nasr.algorithm.sort;

import java.util.Arrays;

public class   InsertionSort<E extends Comparable<E>> {

     public void sort(E[] elements) {
          if (isArrayContainSingleElement(elements))
               throw new IllegalStateException("you have array with single element . doesnt need to be sorted .");

          for (int index=1; index<elements.length;index++){

               int counter=index-1;
               E element = elements[index];

               while (counter>=0 && elements[counter].compareTo(element)>0){

                    elements[counter+1]=elements[counter];
                    counter--;
               }
               elements[counter+1]=element;

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

     public static void main(String[] args) {
          Integer[] data= new Integer[] {7,3,9,2,4};
          InsertionSort<Integer> insertionSort  =new InsertionSort<>();
          insertionSort.sort(data);

          System.out.println(Arrays.toString(data));
     }
}
