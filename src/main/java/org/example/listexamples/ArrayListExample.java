package org.example.listexamples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1); //0
        list.add(2); //1
        list.add(3); //2

        System.out.println("size " + list.size());
        System.out.println(list);

        list.remove(2);
        System.out.println("size " + list.size());
        System.out.println(list);
    }
}