package KeepingBooksInLibrary;

import java.util.ArrayList;


public class Library {
    private final String bookName;
    private static ArrayList<Book> books = new ArrayList<Book>();


    public Library(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return getBookName();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
    public static void addBook(Book book) {
        books.add(book);
    }
    public static void findBook(String publisher) {
        int indexCounter = 0;
        int searchingBookIndex = 0;

        for (Book book1 : books) {
            if (book1.getPublisher().equalsIgnoreCase(publisher)) {
                searchingBookIndex = indexCounter;
            }
            indexCounter++;
        }
        System.out.println("The searching book: ");
        System.out.println(books.get(searchingBookIndex));
    }

    public static void removeBook(String author) {
        int indexCounter = 0;
        int searchingBookIndex = 0;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                searchingBookIndex = indexCounter;
            }
            indexCounter++;
        }
        System.out.println("The book has been removed: " + books.get(searchingBookIndex));
        books.remove(searchingBookIndex);
    }

}




