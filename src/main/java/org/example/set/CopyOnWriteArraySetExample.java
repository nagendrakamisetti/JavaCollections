package org.example.set;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArraySet
        CopyOnWriteArraySet<String> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

        // Adding elements to the set
        copyOnWriteArraySet.add("Apple");
        copyOnWriteArraySet.add("Orange");
        copyOnWriteArraySet.add("Banana");

        // Concurrent iteration without fear of modification
        System.out.println("Elements in CopyOnWriteArraySet:");
        Iterator<String> iterator = copyOnWriteArraySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            copyOnWriteArraySet.add("Grapes"); // Concurrent write
        }

        System.out.println("Updated elements after concurrent modification:");
        copyOnWriteArraySet.forEach(System.out::println);
    }
}
