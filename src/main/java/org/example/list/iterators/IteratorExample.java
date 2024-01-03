package org.example.list.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2

        // Iterator
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int val = iterator.next();
            if (val == 1) {
                iterator.remove();
            }
            System.out.println(val);
        }
        System.out.println("list elements " + list);
    }
}