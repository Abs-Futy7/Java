/*
 Write a Java program to create a class called "Book" with
 attributes for title, author, and ISBN, and methods to add
 and remove books from a collection.
 */

package package4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("An Introduction to Python", "Guido", "933489");
        Book book2 = new Book("ASAP Python", "Gui", "93489");

        Book.addBook(book1);
        Book.addBook(book2);

        ArrayList<Book> bookCollection = Book.getBookCollection();

        System.out.println("List of books:");
        for(Book book : bookCollection){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }

        Book.removeBook(book1);

        System.out.println("List of books:");
        for (Book book : bookCollection) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getISBN());
        }
    }
}
