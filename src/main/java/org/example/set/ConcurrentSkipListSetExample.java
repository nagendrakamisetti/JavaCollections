package org.example.set;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetExample {
    public static void main(String[] args) {
        ConcurrentSkipListSet<Integer> skipListSet = new ConcurrentSkipListSet<>();

        skipListSet.add(5);
        skipListSet.add(2);
        skipListSet.add(8);

        System.out.println("Elements in ConcurrentSkipListSet:");
        skipListSet.forEach(System.out::println);
    }
}

