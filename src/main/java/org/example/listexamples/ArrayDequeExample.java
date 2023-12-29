package org.example.listexamples;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Initializing an deque
        ArrayDeque<Integer> deQue = new ArrayDeque<>(10);

        // add() method to insert
        deQue.add(10);
        deQue.add(20);
        deQue.add(30);
        deQue.add(40);
        deQue.add(50);

        System.out.println(deQue);

        // clear() method
        deQue.clear();

        // addFirst() method to insert the
        // elements at the head
        deQue.addFirst(564);
        deQue.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        deQue.addLast(24);
        deQue.addLast(14);

        System.out.println(deQue);
    }
}
