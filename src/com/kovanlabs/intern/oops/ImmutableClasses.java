package com.kovanlabs.intern.oops;

final class Employee {
    private final int id;
    private final String name;

     double salary;

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

    public double setSalary(double salary){
        this.salary = salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

}
    public class ImmutableClasses {

        public static void main(String[] args) {

            Employee e1 = new Employee(1, "uthayaa", 10000);
            Employee e2 = new Employee(2, "samy", 20000);

            e1.setSalary(2000);
            System.out.println(e1);
            System.out.println(e2);

        }
    }



