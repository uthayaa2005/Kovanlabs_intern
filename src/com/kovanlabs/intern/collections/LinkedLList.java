package com.kovanlabs.intern.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("uthayaaa");

        list.add("praveen");
        list.add("manii");
        list.addFirst("ram");
        list.add(1,"thiksha");
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
