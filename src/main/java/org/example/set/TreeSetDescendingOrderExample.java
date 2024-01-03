package org.example.set;

import java.util.*;

public class TreeSetDescendingOrderExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Integers
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder()); // Initialize TreeSet with reverse comparator

        // Adding elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(1);

        System.out.println("TreeSet with reverse comparator:" + treeSet);

        // Displaying the TreeSet in descending order using descendingSet() and iterator
        System.out.println("TreeSet in descending order using descendingSet() and iterator:");
        Iterator<Integer> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // Another way to display TreeSet in descending order using List and reverse
        List<Integer> reversedList = new ArrayList<>(treeSet);
        Collections.reverse(reversedList);
        System.out.println("TreeSet in descending order using List and reverse:");
        for (Integer num : reversedList) {
            System.out.println(num);
        }
    }
}

