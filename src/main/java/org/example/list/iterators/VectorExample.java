package org.example.list.iterators;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();

        list.add(1);
        list.add(2);
        System.out.println("size " + list.size());
        list.add(3);

        System.out.println(list);
        Enumeration<Integer> elements = list.elements();
        while (elements.hasMoreElements()) {
            Integer val = elements.nextElement();
            System.out.println(val);
        }
    }
}