package com.kovanlabs.intern.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add(0,"manii");
        list.add(0,"uthayaa");
        list.add(1,"thiksha");
        list.remove(0);



        for(int i=0;i<list.size();i++){
            System.out.println(i +" "+ list.get(i));
        }


//        Iterator<String> it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
