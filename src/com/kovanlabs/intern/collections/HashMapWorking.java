package com.kovanlabs.intern.collections;

import java.util.HashMap;

public class HashMapWorking {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 200);

        map.put("Ball",300);

        map.put("Cat",400);

        int hash ="Apple".hashCode();
        int hash1 ="Ball".hashCode();
        int hash2 ="Cat".hashCode();

        int index = hash % 16;
        int index1 = hash1 % 16;
        int index2 = hash2 % 16;

        System.out.println(index);
        System.out.println(index1);
        System.out.println(index2);

    }
}
