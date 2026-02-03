package com.kovanlabs.intern.numericalproblems;

public class Fibonacci {

       static long[] count;

       static long fib(int n){

           if(n == 0 || n == 1){
               return n;
           }
              count[n] = fib(n-1) + fib(n-2);
               return count[n];

       }

    public static void main(String[] args) {

           int n = 10;

           count = new long[n+1];

           for(int i=0;i<n;i++){
               count[i] = -1;
           }

           System.out.print(n +" = "+ fib(n) );
    }

    }

