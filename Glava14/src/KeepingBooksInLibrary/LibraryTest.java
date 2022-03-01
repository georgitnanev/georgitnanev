package KeepingBooksInLibrary;


import java.util.ArrayList;

public class LibraryTest {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        Library.addBook(new Book("It", "Stephen King", "The Dark Tower", 1996, 2000));
        Library.addBook(new Book("Rage", "Stephen King", "The Dark Tower", 1977, 1000));
        Library.addBook(new Book("The Long Walk", "Stephen King", "The Dark Tower", 1979, 1100));
        Library.addBook(new Book("A Dance with Dragons", "George Martin", "Voyager Books", 2008, 3005));
        Library.addBook(new Book("Winds of Winter", "George Martin", "Voyager Books", 2021, 3010));
        Library.addBook(new Book("Pod Igoto", "Ivan Vazov", "Zname", 1911, 4010));


            Library.findBook("Zname");
            System.out.println("................");
            Library.removeBook("Stephen King");
            System.out.println("............");



        }
    }


