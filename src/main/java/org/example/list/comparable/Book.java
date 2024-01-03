package org.example.list.comparable;

import lombok.Data;

@Data
public class Book implements Comparable<Book> {
    private String title;
    private int pageCount;
    private String author;

    public Book(String title, int pageCount, String author) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
    }

    public Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pageCount, other.getPageCount());
    }

}

