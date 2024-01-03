package org.example.set;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        Set<String> fruitSet = new HashSet<>();

        // Adding elements to the HashSet
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add(null);
        fruitSet.add("Orange");
        fruitSet.add(null);
        fruitSet.add("Apple"); // Adding a duplicate element (ignored)

        // Displaying the HashSet
        System.out.println("HashSet: " + fruitSet);

        // Checking existence
        System.out.println("Contains 'Banana'? " + fruitSet.contains("Banana"));

        // Removing an element
        fruitSet.remove("Orange");
        System.out.println("After removing 'Orange': " + fruitSet);

        // Size of the HashSet
        System.out.println("Size of HashSet: " + fruitSet.size());

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }

        // Clearing the HashSet
        fruitSet.clear();
        System.out.println("HashSet after clearing: " + fruitSet);
    }
}
