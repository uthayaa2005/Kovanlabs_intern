package com.kovanlabs.intern.singleton;

public class ObjectCounter {
    private static int count =0;

    public  ObjectCounter(){
        count++;
    }

    public static int getCount(){
        return count;
    }

    public static void main(String[] args) {

        ObjectCounter s1 = new ObjectCounter();
        ObjectCounter s2 = new ObjectCounter();
        ObjectCounter s3 = new ObjectCounter();
        ObjectCounter s4 = new ObjectCounter();
        ObjectCounter s5 = new ObjectCounter();
        ObjectCounter s6 = new ObjectCounter();

        System.out.println(ObjectCounter.getCount());
    }

}
