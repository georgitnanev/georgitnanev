package KeepingBooksInLibrary;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String bookTitle;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private final int ISBN;
    private static int counter = 1;




    public Book(String bookTitle, String author, String publisher, int yearOfPublishing, int ISBN) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.ISBN = Book.counter;
        raiseCounter();
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getISBN() {
        return ISBN;
    }
    public int getCounter(int counter) {
        return counter;

    }
    public static void raiseCounter() {
        counter++;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", ISBN=" + ISBN +
                '}';
    }
    public static void printInfo() {
        return;
    }



}


