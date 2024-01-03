package org.example.map;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Creating a LinkedHashMap to store fruits and their quantities
        Map<String, Integer> fruitQuantities = new LinkedHashMap<>();

        // Adding elements to the LinkedHashMap
        fruitQuantities.put("Apple", 10);
        fruitQuantities.put("Banana", 20);
        fruitQuantities.put("Orange", 15);
        fruitQuantities.put("Grapes", 30);

        // Accessing elements
        System.out.println("Quantity of Apples: " + fruitQuantities.get("Apple"));

        // Iterating through the LinkedHashMap
        System.out.println("\nPrinting all fruits and their quantities:");
        for (Map.Entry<String, Integer> entry : fruitQuantities.entrySet()) {
            String fruit = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("Fruit: " + fruit + ", Quantity: " + quantity);
        }

        // Checking if a key exists
        String fruitToCheck = "Orange";
        if (fruitQuantities.containsKey(fruitToCheck)) {
            System.out.println("\n" + fruitToCheck + " is present in the map");
        }

        // Removing an element
        String fruitToRemove = "Banana";
        fruitQuantities.remove(fruitToRemove);
        System.out.println("\nAfter removing " + fruitToRemove + ": " + fruitQuantities);
    }
}

