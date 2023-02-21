package com.nasr.algorithm.sort;

public class   InsertionSort<E extends Comparable<E>>  implements Sortable<E>{

     @Override
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
}
