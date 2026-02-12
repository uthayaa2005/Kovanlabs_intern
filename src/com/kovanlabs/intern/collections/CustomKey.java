package com.kovanlabs.intern.collections;

import java.util.HashMap;
import java.util.Objects;

class Person{
    String name;
    Person(String name){
        this.name=name;
    }

    @Override
    public boolean equals(Object object){
        Person person = (Person) object;
        return this.name.equals(person.name);
    }

    @Override
    public  int hashCode(){
        return Objects.hash();
    }
}
public class CustomKey {
    public static void main(String[] args) {

        HashMap<Person,Integer> hashMap= new HashMap<>();
        Person person1= new Person("uthayaa");
        Person person2=new Person("uthayaa");

        hashMap.put(person1,100);
        hashMap.put(person2,300);
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(person2));
    }
}