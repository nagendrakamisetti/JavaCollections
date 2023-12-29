package org.example.listexamples;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListFailFast {

    public static void main(String[] args) {
        failFast();
        // nonFailFast();
    }

    private static void failFast() {
        List<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("John");
        names.add("Sam");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("Sam")) {
                names.add("Philip");
                //iterator.add("Philip");
            }
        }
        System.out.println(names);
    }

    private static void nonFailFast() {
        List<String> names = new CopyOnWriteArrayList<>();
        names.add("Ram");
        names.add("John");
        names.add("Sam");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
            if (element.equals("Sam")) {
                names.add("Philip");
                // iterator.add("Philip");
            }
        }
        System.out.println(names);
    }
}