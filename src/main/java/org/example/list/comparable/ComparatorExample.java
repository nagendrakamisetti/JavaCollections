package org.example.list.comparable;

import java.util.Arrays;

public class ComparatorExample {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Java Programming", 400),
                new Book("Data Structures", 300),
                new Book("Algorithms", 500)
        };

        Arrays.sort(books, new BookTitleComparator()); // Sorting using Comparator

        System.out.println("Books sorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

