import java.util.Scanner;

// Publisher class
class Publisher {
    // Data members
    protected String publisherName;

    // Constructor to initialize data members of Publisher
    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

// Book class
class Book {
    // Data members
    protected String bookTitle;
    protected Publisher publisher;

    // Constructor to initialize data members of Book
    public Book(String bookTitle, Publisher publisher) {
        this.bookTitle = bookTitle;
        this.publisher = publisher;
    }
}

// Literature class inherited from Book
class Literature extends Book {
    // Constructor to initialize data members of Literature
    public Literature(String bookTitle, Publisher publisher) {
        // Call the constructor of the superclass (Book) to initialize its data members
        super(bookTitle, publisher);
    }
}

// Fiction class inherited from Book
class Fiction extends Book {
    // Constructor to initialize data members of Fiction
    public Fiction(String bookTitle, Publisher publisher) {
        // Call the constructor of the superclass (Book) to initialize its data members
        super(bookTitle, publisher);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input the number of books
        System.out.println("Enter the number of books:");
        int n = scanner.nextInt();

        // Consume newline
        scanner.nextLine();

        // Input details for each book
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Book " + (i + 1) + ":");
            System.out.println("Book Title:");
            String bookTitle = scanner.nextLine();
            System.out.println("Publisher Name:");
            String publisherName = scanner.nextLine();

            // Create Publisher object
            Publisher publisher = new Publisher(publisherName);

            // Determine the category of the book and create the corresponding object
            System.out.println("Enter the category of the book (Literature/Fiction):");
            String category = scanner.nextLine();
            Book book;
            if (category.equalsIgnoreCase("Literature")) {
                book = new Literature(bookTitle, publisher);
            } else if (category.equalsIgnoreCase("Fiction")) {
                book = new Fiction(bookTitle, publisher);
            } else {
                System.out.println("Invalid category! Skipping this book.");
                continue;
            }

            // Display details of the book
            System.out.println("Details of Book " + (i + 1) + ":");
            System.out.println("Book Title: " + book.bookTitle);
            System.out.println("Publisher Name: " + book.publisher.publisherName);
            System.out.println("Category: " + category);
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
