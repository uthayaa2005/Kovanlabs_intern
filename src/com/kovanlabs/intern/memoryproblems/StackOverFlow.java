package com.kovanlabs.intern.memoryproblems;

public class StackOverFlow {

    static void show(int n){
      if(n == 0) return;
      System.out.println(n);
      show(n-1);
    }

    public static void main(String[] args) {

        show(5);
    }


}
