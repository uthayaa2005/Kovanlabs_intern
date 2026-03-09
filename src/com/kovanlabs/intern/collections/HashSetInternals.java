package com.kovanlabs.intern.collections;

import java.util.HashSet;

public class HashSetInternals {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("uthayaa");
        hs.add("anu");
        hs.add("mand");
        hs.add("Anu");

      System.out.println(  "uthyaaa".hashCode());
      System.out.println("uthyaaa".hashCode());


        System.out.println(hs);
    }
}
