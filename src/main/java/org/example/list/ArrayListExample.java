package org.example.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(null); //0
        list.add(1); //1
        list.add(2); //2
        list.add(2); //3
        list.add(null); //4
        list.add(3); //5
        list.add(null); //6

        System.out.println("size " + list.size());
        System.out.println(list);

        list.remove(2);
        System.out.println("size " + list.size());
        System.out.println(list);
    }
}