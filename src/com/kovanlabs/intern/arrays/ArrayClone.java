package com.kovanlabs.intern.arrays;

public class ArrayClone {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5};

        int[] arr1 = arr.clone();

        for(int x : arr1){
            System.out.print(x+" ");
        }
    }
}
