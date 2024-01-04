package org.example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorOnList {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", 400, "John Doe"));
        books.add(new Book("Data Structures", 300, "Alice Smith"));
        books.add(new Book("Algorithms", 500, "Bob Johnson"));

        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
        // BookTitleComparator bookTitleComparator = new BookTitleComparator();
        Collections.sort(books, titleComparator); // Sorting using Comparator
        // Collections.sort(books, bookTitleComparator); // Sorting using Comparator
        // books.sort(titleComparator); // Sorting using Comparator

        System.out.println("Books sorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

