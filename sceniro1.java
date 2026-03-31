import java.util.ArrayList;

class Book {
    String title;
    String author;
    String isbn;

    Book(String t, String a, String i) {
        title = t;
        author = a;
        isbn = i;
    }

    void display() {
        System.out.println(title + " | " + author + " | " + isbn);
    }
}

public class sceniro1 {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        // Adding books
        books.add(new Book("Java Basics", "James", "101"));
        books.add(new Book("Python Guide", "Guido", "102"));

        // Display all books
        System.out.println("All Books:");
        for (Book b : books) {
            b.display();
        }

        // Search book by title
        String search = "Java Basics";
        for (Book b : books) {
            if (b.title.equals(search)) {
                System.out.println("\nBook Found:");
                b.display();
            }
        }
    }
}