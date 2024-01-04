package org.example.list;

import java.io.*;
import java.util.ArrayList;

public class ArrayListSerialization {

    public static void main(String[] args) {
        System.out.println("serialize");
        serialize();
        System.out.println("De-serialize");
        deSerialize();
    }

    private static void deSerialize() {
        ArrayList<Employee> employeesList = null;

        try (FileInputStream fis = new FileInputStream("employeeData");
             ObjectInputStream ois = new ObjectInputStream(fis);) {

            employeesList = (ArrayList) ois.readObject();

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
        }

        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }

    private static void serialize() {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1L, "lokesh", "gupta"));
        employees.add(new Employee(2L, "brian", "motto"));

        try (FileOutputStream fos = new FileOutputStream("employeeData");
             ObjectOutputStream oos = new ObjectOutputStream(fos);) {

            oos.writeObject(employees);

        } catch (FileNotFoundException e) {
            System.out.println("File not found : ");
            throw new RuntimeException(e);
        } catch (IOException ioe) {
            System.out.println("Error while writing data : ");
            ioe.printStackTrace();
        }
    }
}