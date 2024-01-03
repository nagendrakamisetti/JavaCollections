package org.example.list.comparable;

import java.util.Arrays;

public class ComparableExample {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Programming", 400),
                new Book("Data Structures", 300),
                new Book("Algorithms", 500)
        };

        Arrays.sort(books); // Sorting using Comparable

        System.out.println("Books sorted by page count:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

