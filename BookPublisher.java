package com.solid.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

public interface to_file{
    public void printToFile();
}

class book_for_publisher implements to_file{
    Book book;
    
    public book_for_publisher(Book book){
        this.book = book; 
    }

    @Override
    public void printToFile() {
            // Book book = this;
            boolean isEven = false;
            String previousPage = "";
            try {
                FileWriter fileWriter = new FileWriter(this.book.getTitle() + ".txt");
                PrintWriter printWriter = new PrintWriter(fileWriter);
                do {
                    if (isEven) {
                        previousPage = this.book.getCurrentPage();
                        isEven = false;
                    } else {
                        printWriter.printf("%-25s : %25s%n", previousPage, this.book.getCurrentPage());
                        isEven = true;
                    }
                } while (this.book.turnToNextPage());
                printWriter.close();
            } catch (IOException ex) {
                System.out.println("Cannot print this book due to IOException");
            }
        }

}

public class BookPublisher {
    public static void main(String[] args) {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        book_for_publisher publisher = new book_for_publisher(book);
        publisher.printToFile();
    }
}
