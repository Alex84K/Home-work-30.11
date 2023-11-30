package ait.employee.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private static final long serialVersionUID = 30112023135530L;
    private final int id;
    private String name;
    private LocalDate brithDate;
    private double salary;
    private Address address;

    public Employee(int id, String name, LocalDate brithDate, double salary, Address address) {
        System.out.println("Adress");
        this.id = id;
        this.name = name;
        this.brithDate = brithDate;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBrithDate() {
        return brithDate;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brithDate=" + brithDate +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Employee employee)) return false;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
