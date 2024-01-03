package org.example.set;

import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet of Strings
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedHashSet.add("Apple");
        linkedHashSet.add(null);
        linkedHashSet.add("Banana");
        linkedHashSet.add(null);
        linkedHashSet.add("Orange");

        // Displaying the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Adding duplicate element (ignored)
        linkedHashSet.add("Banana");
        System.out.println("After adding 'Banana' again: " + linkedHashSet);

        // Removing an element
        linkedHashSet.remove("Orange");
        System.out.println("After removing 'Orange': " + linkedHashSet);

        // Checking existence
        System.out.println("Contains 'Apple'? " + linkedHashSet.contains("Apple"));

        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + linkedHashSet.size());

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }

        // Clearing the LinkedHashSet
        linkedHashSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedHashSet);
    }
}

