package org.example.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Integers
        TreeSet<Integer> treeSet = new TreeSet<>();


        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        // Displaying the TreeSet (sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Checking existence
        System.out.println("Contains 8? " + treeSet.contains(8));

        // Removing an element
        treeSet.remove(2);
        System.out.println("After removing 2: " + treeSet);

        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + treeSet.size());

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (Integer num : treeSet) {
            System.out.println(num);
        }

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);
    }
}

