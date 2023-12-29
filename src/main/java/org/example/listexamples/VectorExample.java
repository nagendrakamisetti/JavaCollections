package org.example.listexamples;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<Integer> list = new Vector<>();

        list.add(1);
        list.add(2);
        System.out.println("size " + list.size());
        list.add(3);

        System.out.println(list);
    }
}