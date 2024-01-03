package org.example.list;

import java.util.Stack;

/**
 * LIFO
 */
public class StackExample {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Apple");
        stack.push("Banana");
        stack.push("Mango");

        System.out.println(stack);
        System.out.println("Returns last element: " + stack.peek());
        System.out.println(stack);
        System.out.println("Removes last element: " + stack.pop());
        System.out.println(stack);
    }
}