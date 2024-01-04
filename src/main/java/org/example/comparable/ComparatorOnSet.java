package org.example.comparable;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorOnSet {
    public static void main(String[] args) {
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        Set<Book> bookSet = new TreeSet<>(titleComparator);

        bookSet.add(new Book("Java Programming", 400, "John Doe"));
        bookSet.add(new Book("Data Structures", 300, "Alice Smith"));
        bookSet.add(new Book("Algorithms", 500, "Bob Johnson"));

        System.out.println("Books sorted by title:");
        for (Book book : bookSet) {
            System.out.println(book);
        }
    }
}

