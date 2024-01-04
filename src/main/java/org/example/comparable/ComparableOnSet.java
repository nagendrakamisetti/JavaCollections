package org.example.comparable;

import java.util.Set;
import java.util.TreeSet;

public class ComparableOnSet {
    public static void main(String[] args) {
        Set<Book> bookSet = new TreeSet<>();
        bookSet.add(new Book("Java Programming", 400, "John Doe"));
        bookSet.add(new Book("Data Structures", 300, "Alice Smith"));
        bookSet.add(new Book("Algorithms", 500, "Bob Johnson"));

        System.out.println("Books sorted by page count:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}

