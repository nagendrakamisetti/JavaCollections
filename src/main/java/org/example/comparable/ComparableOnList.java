package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableOnList {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 400, "John Doe"));
        books.add(new Book("Data Structures", 300, "Alice Smith"));
        books.add(new Book("Algorithms", 500, "Bob Johnson"));

        Collections.sort(books); // Sorting using Comparable

        System.out.println("Books sorted by page count:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
