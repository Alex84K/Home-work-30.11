package ait.employee;

import ait.employee.model.Employee;

import java.io.*;
import java.util.HashSet;

public class RestoreEmploeeAppl {
    public static void main(String[] args) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("amployees.dat"))) {
            HashSet<Employee> employees = (HashSet<Employee>) ois.readObject();
            employees.forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
