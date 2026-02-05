package com.kovanlabs.intern.oops;

final class Employee {
    private final int id;
    private final String name;

    private final double salary;

    public Employee(int id, String name,double salary) {
        this .id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return Employee{ "id = "+ id +" name = "+ name +" salary = "+ salary };
    }
}
    public class ImmutableClasses {

        public static void main(String[] args) {

        }
    }



