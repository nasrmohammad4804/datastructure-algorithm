package com.nasr.algorithm.sort;

/*E as argument need to comparable like string or integer
* T as return Type*/
public interface Sortable<E extends Comparable<E>> {

     void  sort(E[] elements);

}
