package org.example.map;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Creating a ConcurrentHashMap to store user IDs and their names
        ConcurrentHashMap<Integer, String> userMap = new ConcurrentHashMap<>();

        // Adding elements to the ConcurrentHashMap
        userMap.put(1, "Alice");
        userMap.put(2, "Bob");
        userMap.put(3, "Charlie");
        userMap.put(4, "David");

        // Accessing elements
        System.out.println("User with ID 3: " + userMap.get(3));

        // Iterating through the ConcurrentHashMap
        System.out.println("\nPrinting all users and their IDs:");
        userMap.forEach((id, name) -> System.out.println("User ID: " + id + ", Name: " + name));

        // Checking if a key exists
        int userIdToCheck = 2;
        if (userMap.containsKey(userIdToCheck)) {
            System.out.println("\nUser with ID " + userIdToCheck + " exists");
        }

        // Removing an element
        int userIdToRemove = 4;
        userMap.remove(userIdToRemove);
        System.out.println("\nAfter removing user with ID " + userIdToRemove + ": " + userMap);
    }
}

