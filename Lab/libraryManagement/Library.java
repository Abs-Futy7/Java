interface User {
    void borrowBook(Book book);
    void returnBook(Book book);
    void getBorrowedBooks();
}

// Abstract Book class with common properties
abstract class Book {
    String title;
    String author;
    boolean isAvailable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    abstract void getDetails();
}

// PrintedBook class extends Book (Physical Book)
class PrintedBook extends Book {
    PrintedBook(String title, String author) {
        super(title, author);
    }
    @Override
    void getDetails() {
        System.out.println("Printed Book: " + title + " by " + author);
    }
}

// EBook class extends Book (Digital Book)
class EBook extends Book {
    EBook(String title, String author) {
        super(title, author);
        this.isAvailable = true;  // EBooks are always available
    }

    @Override
    void getDetails() {
        System.out.println("EBook: " + title + " by " + author);
    }
}

// Student class implementing User interface
class Student implements User {
    private Book[] borrowedBooks = new Book[3];
    private int borrowCount = 0;

    @Override
    public void borrowBook(Book book) {
        if (borrowCount >= 3) {
            System.out.println("Student cannot borrow more than 3 books.");
            return;
        }
        if (book instanceof PrintedBook && !book.isAvailable) {
            System.out.println("Printed Book is not available for borrowing.");
            return;
        }

        borrowedBooks[borrowCount++] = book;
        if (book instanceof PrintedBook) {
            book.isAvailable = false;  // Mark the PrintedBook as borrowed
        }
        System.out.println("Book borrowed: " + book.title);
    }

    @Override
    public void returnBook(Book book) {
        for (int i = 0; i < borrowCount; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = null;
                for (int j = i; j < borrowCount - 1; j++) {
                    borrowedBooks[j] = borrowedBooks[j + 1];
                }
                borrowedBooks[--borrowCount] = null;
                if (book instanceof PrintedBook) {
                    book.isAvailable = true;  // Mark the PrintedBook as available
                }
                System.out.println("Book returned: " + book.title);
                return;
            }
        }
        System.out.println("This book was not borrowed by the student.");
    }

    @Override
    public void getBorrowedBooks() {
        System.out.println("Books borrowed by Student:");
        for (int i = 0; i < borrowCount; i++) {
            System.out.println(borrowedBooks[i].title);
        }
    }
}

// Faculty class implementing User interface
class Faculty implements User {
    private Book[] borrowedBooks = new Book[10];
    private int borrowCount = 0;

    @Override
    public void borrowBook(Book book) {
        if (borrowCount >= 10) {
            System.out.println("Faculty cannot borrow more than 10 books.");
            return;
        }
        if (book instanceof PrintedBook && !book.isAvailable) {
            System.out.println("Printed Book is not available for borrowing.");
            return;
        }

        borrowedBooks[borrowCount++] = book;
        if (book instanceof PrintedBook) {
            book.isAvailable = false;  // Mark the PrintedBook as borrowed
        }
        System.out.println("Book borrowed: " + book.title);
    }

    @Override
    public void returnBook(Book book) {
        for (int i = 0; i < borrowCount; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = null;
                for (int j = i; j < borrowCount - 1; j++) {
                    borrowedBooks[j] = borrowedBooks[j + 1];
                }
                borrowedBooks[--borrowCount] = null;
                if (book instanceof PrintedBook) {
                    book.isAvailable = true;  // Mark the PrintedBook as available
                }
                System.out.println("Book returned: " + book.title);
                return;
            }
        }
        System.out.println("This book was not borrowed by the faculty.");
    }

    @Override
    public void getBorrowedBooks() {
        System.out.println("Books borrowed by Faculty:");
        for (int i = 0; i < borrowCount; i++) {
            System.out.println(borrowedBooks[i].title);
        }
    }
}


public class Library{
    public static void main(String[] args) {
        Book book1 = new PrintedBook("Java Programming", "James Gosling");
        Book book2 = new PrintedBook("Data Structures", "Robert Sedgewick");
        Book book3 = new EBook("Introduction to Algorithms", "Thomas H. Cormen");
        Book book4 = new PrintedBook("Design Patterns", "Erich Gamma");
        Book book5 = new EBook("Clean Code", "Robert C. Martin");

        // Create users
        User student = new Student();
        User faculty = new Faculty();

        // Borrowing books
        student.borrowBook(book1);
        student.borrowBook(book2);
        student.borrowBook(book3);
        student.borrowBook(book4);  // Should be rejected

        faculty.borrowBook(book4);
        faculty.borrowBook(book5);

        // Returning books
        student.returnBook(book2);
        student.borrowBook(book4);  // Should be successful now

        faculty.returnBook(book4);

        // Display borrowed books
        student.getBorrowedBooks();
        faculty.getBorrowedBooks();

        // Display book details
        book1.getDetails();
        book2.getDetails();
        book3.getDetails();
        book4.getDetails();
        book5.getDetails();
    
    }
}