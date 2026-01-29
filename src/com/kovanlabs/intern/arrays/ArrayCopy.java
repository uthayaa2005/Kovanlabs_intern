package com.kovanlabs.intern.arrays;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        int[] arr1 ={6,7,8,9,4};

        int[] src = new int[9];

        System.arraycopy(arr,0,src,0,arr.length);
        System.arraycopy(arr1,0,src,4,arr1.length);

        for(int x : src){
            System.out.print(x+" ");
        }
    }
}
