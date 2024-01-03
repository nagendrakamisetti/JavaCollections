package org.example.map;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable to store country codes and their names
        Hashtable<String, String> countryCodes = new Hashtable<>();

        // Adding elements to the Hashtable
        // countryCodes.put(null, "Test"); // nulls are not allowed
        countryCodes.put("US", "United States");
        countryCodes.put("UK", "United Kingdom");
        countryCodes.put("FR", "France");
        countryCodes.put("JP", "Japan");
        countryCodes.put("IN", "India");
        // countryCodes.put(null, "Test"); // null not allowed

        // Accessing elements
        System.out.println("Country with code 'FR': " + countryCodes.get("FR"));

        // Iterating through the Hashtable
        System.out.println("\nPrinting all country codes and names:");
        for (Map.Entry<String, String> entry : countryCodes.entrySet()) {
            String code = entry.getKey();
            String name = entry.getValue();
            System.out.println("Country code: " + code + ", Name: " + name);
        }

        // Checking if a key exists
        String codeToCheck = "UK";
        if (countryCodes.containsKey(codeToCheck)) {
            System.out.println("\nCountry with code '" + codeToCheck + "' exists");
        }

        // Removing an element
        String codeToRemove = "JP";
        countryCodes.remove(codeToRemove);
        System.out.println("\nAfter removing country with code '" + codeToRemove + "': " + countryCodes);
    }
}

