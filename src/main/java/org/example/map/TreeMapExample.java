package org.example.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap to store student IDs and their names
        TreeMap<Integer, String> studentMap = new TreeMap<>();
        //Map<Integer, String> studentMap = new TreeMap<>();

        // Adding elements to the TreeMap
        studentMap.put(103, "Alice");
        studentMap.put(101, "Bob");
        studentMap.put(105, "Charlie");
        studentMap.put(102, "David");
        studentMap.put(104, "Eve");

        // Accessing elements
        int studentID = 102;
        System.out.println("Student with ID " + studentID + " is: " + studentMap.get(studentID));

        // Iterating through the TreeMap
        System.out.println("\nPrinting all student IDs and names:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            int id = entry.getKey();
            String name = entry.getValue();
            System.out.println("Student ID: " + id + ", Name: " + name);
        }

        // Checking the first and last elements in the TreeMap
        System.out.println("\nFirst student: " + studentMap.firstEntry());
        System.out.println("Last student: " + studentMap.lastEntry());

        // Removing an element
        int idToRemove = 103;
        studentMap.remove(idToRemove);
        System.out.println("\nAfter removing student with ID " + idToRemove + ": " + studentMap);
    }
}

