package com.company.statics.ctor;

import java.util.ArrayList;
import java.util.List;

public class BookExample {
    public static void main(String[] args) {
        Book ссылка = new Book("Head first");
        ссылка.getBookName();
        ссылка.getStaticBookName();

        Book.getStaticBookName();

        Book.books.get(0);

//        Book.getBookName();
    }
}


class Book {

    static String libraryName = "Lib 1";

    static List<Book> books = new ArrayList<>();

    public Book(String bookName) {
        System.out.println("constructor");
        this.bookName = bookName;
        books.add(this);
    }

    private String bookName;
    private Integer pages;















    public String getBookName() {
        return bookName;
    }

    public static String getStaticBookName() {
        return "";
    }
}