package day3_4.q3;

import java.io.*;

// Address class with a non-serializable field "salary"
class Address implements Serializable {
    private final String address;
    transient double salary; // salary is not serializable

    // Constructor for Address class
    public Address(String address, double salary) {
        this.address = address;
        this.salary = salary;
    }

    // Display function to show the address and salary
    public void display() {
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);  // Salary will not be serialized
    }
}