package org.example.listexamples.iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2


        // ListIterator
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int val = listIterator.next();
            if (val == 1) {
                listIterator.remove();
                listIterator.add(4);
            }
            System.out.println(val);
        }
        System.out.println("list elements " + list);
    }
}