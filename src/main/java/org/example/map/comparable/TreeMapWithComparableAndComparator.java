package org.example.map.comparable;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithComparableAndComparator {
    public static void main(String[] args) {
        // Creating a TreeMap with a custom Comparator to sort by name length
        Map<Person, String> personMap = new TreeMap<>(Comparator.comparingInt(person -> person.getName().length()));
        // Map<Person, String> personMap = new TreeMap<>(); // uses natural sorting

        // Adding elements to the TreeMap
        personMap.put(new Person("Alice", 25), "Engineer");
        personMap.put(new Person("Bob", 30), "Doctor");
        personMap.put(new Person("Charlie", 28), "Artist");
        personMap.put(new Person("David", 22), "Student");

        // Accessing elements (sorted by name length)
        System.out.println("Persons sorted by name length:");
        for (Map.Entry<Person, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
