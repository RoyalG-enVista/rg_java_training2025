package day3_4.q3;

import java.io.Serializable;

// Employee class implements Serializable
class Employee implements Serializable {
    private final int id;
    private final String name;
    private final Address address;

    // Constructor for Employee class
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Getter methods for Employee class
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
