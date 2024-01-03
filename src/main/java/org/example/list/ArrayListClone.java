package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClone {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> list2 = list1;
        // List<Integer> list2 = (List<Integer>) ((ArrayList<Integer>) list1).clone();
        list1.remove(1);
        System.out.println("list1 " + list1);
        System.out.println("list2 " + list2);
    }
}