package com.te.true2dsa.interview;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Employee class implementing Comparable interface
class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Override the compareTo method
    @Override
    public int compareTo(Employee other) {
        // Compare salaries (ascending order)
        return Double.compare(this.salary, other.salary);
    }

    // Override toString for better output
    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + "}";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 70000));
        employees.add(new Employee("Bob", 50000));
        employees.add(new Employee("Charlie", 60000));

        // Sort the list of employees based on salary
        Collections.sort(employees);

        // Print the sorted list of employees
        System.out.println("Employees sorted by salary:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
