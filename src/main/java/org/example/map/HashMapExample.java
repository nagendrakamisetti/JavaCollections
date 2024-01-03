package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap to store country names and their capitals
        Map<String, String> capitals = new HashMap<>();

        // Adding elements to the HashMap
        // capitals.put(null, "Test-1"); // nulls are allowed
        capitals.put("USA", "Washington, D.C.");
        capitals.put("UK", "London");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("India", "New Delhi");
        capitals.put(null, "Test-2"); // nulls are allowed

        // Accessing elements
        System.out.println("The capital of France is: " + capitals.get("France"));

        // Iterating through the HashMap
        System.out.println("\nPrinting all countries and their capitals:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            String country = entry.getKey();
            String capital = entry.getValue();
            System.out.println("Capital of " + country + " is " + capital);
        }

        // Checking if a key exists
        String countryToCheck = "Germany";
        if (capitals.containsKey(countryToCheck)) {
            System.out.println("\nCapital of " + countryToCheck + " is " + capitals.get(countryToCheck));
        } else {
            System.out.println("\nCapital of " + countryToCheck + " is not present in the map.");
        }

        // Removing an element
        String countryToRemove = "USA";
        capitals.remove(countryToRemove);
        System.out.println("\nAfter removing " + countryToRemove + ": " + capitals);
    }
}
