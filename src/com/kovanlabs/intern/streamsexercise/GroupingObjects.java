package com.kovanlabs.intern.streamsexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    String name;
    String dept;

    Employee(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public String getDept() {
        return dept;
    }

    @Override
    public String toString() {
        return name;
    }

}
public class GroupingObjects {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("jhon","IT"),
                new Employee("ram","IT"),
                new Employee("uthayaa","CSE"),
                new Employee("shyam","CSE"),
                new Employee("sanjai","CSE"),
                new Employee("thiksha" ,"EEE")
        );

        Map<String, List<Employee>> map = employees.stream()

                .collect(Collectors.groupingBy(Employee::getDept));

        System.out.println(map);



    }





}
