package Scenario.LibrarySystem;
import java.util.*;

class Book {
    String title;
    String author;
    String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + "', author='" + author + "', isbn='" + isbn + "'}";
    }
}

class BookShelf {
    private HashMap<String, LinkedList<Book>> catalog;
    private HashSet<String> isbnSet; // To track unique books by ISBN

    public BookShelf() {
        catalog = new HashMap<>();
        isbnSet = new HashSet<>();
    }

    // Add a book to the specified genre
    public boolean addBook(String genre, Book book) {
        // Check for duplicate ISBN
        if (isbnSet.contains(book.isbn)) {
            System.out.println("Book with ISBN " + book.isbn + " already exists!");
            return false;
        }

        // Add to catalog
        catalog.computeIfAbsent(genre, k -> new LinkedList<>()).add(book);
        isbnSet.add(book.isbn);
        System.out.println("Added " + book + " to genre " + genre);
        return true;
    }

    // Remove a book from the specified genre by ISBN
    public boolean removeBook(String genre, String isbn) {
        LinkedList<Book> books = catalog.get(genre);
        if (books == null) {
            System.out.println("Genre " + genre + " not found!");
            return false;
        }

        boolean removed = books.removeIf(book -> book.isbn.equals(isbn));
        if (removed) {
            isbnSet.remove(isbn);
            System.out.println("Removed book with ISBN " + isbn + " from genre " + genre);
            // Clean up empty genre
            if (books.isEmpty()) {
                catalog.remove(genre);
            }
        } else {
            System.out.println("Book with ISBN " + isbn + " not found in genre " + genre);
        }
        return removed;
    }

    // Display all books in a genre
    public void displayGenre(String genre) {
        LinkedList<Book> books = catalog.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books found in genre " + genre);
            return;
        }
        System.out.println("Books in genre " + genre + ":");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Display entire catalog
    public void displayCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Catalog is empty!");
            return;
        }
        for (Map.Entry<String, LinkedList<Book>> entry : catalog.entrySet()) {
            System.out.println("Genre: " + entry.getKey());
            for (Book book : entry.getValue()) {
                System.out.println("  " + book);
            }
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();

        // Adding books
        shelf.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", "123456789"));
        shelf.addBook("Fantasy", new Book("Game of Thrones", "George R.R. Martin", "987654321"));
        shelf.addBook("Sci-Fi", new Book("Dune", "Frank Herbert", "456789123"));
        shelf.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", "123456789")); // Duplicate

        // Display catalog
        shelf.displayCatalog();

        // Display specific genre
        shelf.displayGenre("Fantasy");

        // Remove a book
        shelf.removeBook("Fantasy", "123456789");

        // Display updated catalog
        shelf.displayCatalog();
    }
}