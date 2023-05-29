package com.nasr.algorithm.divideconquer;

import static java.lang.String.valueOf;

/*multiply 2 big number with divide & conquer algorithm */
public class Calculation {
    public static final int THRESHOLD =2;
/*
    A * B = (x * 10^m + y)(w * 10^m + z) -> (xw * 10^2m) + (xz+yw)10^m + yz -> t(n) = 4T(n/2)= o(n^2)
    A * B = (x * 10^m + y)(w * 10^m + z) -> (xw * 10^2m) + ((x+y)(w+z) - xw - yz )10^m + yz -> t(n) = 3T(n/2)= o(n^1.58)
* */
    public static   long multiply(long firstNumber, long secondNumber){

        int maxLength = getMaxLength(firstNumber, secondNumber);

        if (maxLength<= THRESHOLD)
            return (long) firstNumber * secondNumber;

        int n= maxLength/2;

        long x=(long) (firstNumber / Math.pow(10,n));
        long y=  (long) (firstNumber % Math.pow(10,n));

        long w=(long) (secondNumber / Math.pow(10,n));
        long z= (long) (secondNumber % Math.pow(10,n));

        long xw = multiply(x, w);
        long yz= multiply(y,z);

        return (long) ( xw * Math.pow(10,2*n) + (multiply((x+y),(w+z)) - xw - yz ) * Math.pow(10,n) + yz);

    }
    private static int getMaxLength(long firstNumber , long secondNumber){

        if (firstNumber>=secondNumber)
            return valueOf(firstNumber).length();

        return valueOf(secondNumber).length();
    }

}
