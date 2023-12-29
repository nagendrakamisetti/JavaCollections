package org.example.listexamples;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClone {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        List<Integer> list2 = list;
        // List<Integer> list2 = (List<Integer>) ((ArrayList<Integer>) list).clone();
        list.remove(1);
        System.out.println(list);
        System.out.println(list2);

    }
}