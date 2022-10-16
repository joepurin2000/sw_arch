package com.solid.book;


import java.lang.reflect.Constructor;
import java.util.List;

class book_for_reader{
    Book book;

    public book_for_reader(Book book){
        this.book = book;
    }

    public void printToScreen() {
        do {
            System.out.println(this.book.getCurrentPage());
        } while (this.book.turnToNextPage());
    }
}

public class BookReader{
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book_for_reader reader = new book_for_reader(book);
        reader.printToScreen();
    }
}
