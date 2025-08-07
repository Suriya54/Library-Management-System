import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books; // bookId → Book
    private Map<String, User> users; // userId → User

    public Library() {
        books = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getBookId(), book);
    }

    public void addUser(User user) {
        users.put(user.getUserId(), user);
    }

    public boolean issueBook(String userId, String bookId) {
        if (!users.containsKey(userId) || !books.containsKey(bookId)) {
            System.out.println("Invalid User ID or Book ID!");
            return false;
        }

        Book book = books.get(bookId);
        if (book.isAvailable()) {
            book.borrowBook();
            users.get(userId).borrowBook(bookId);
            System.out.println("Book issued successfully!");
            return true;
        } else {
            System.out.println("Book not available!");
            return false;
        }
    }

    public boolean returnBook(String userId, String bookId) {
        if (!users.containsKey(userId) || !books.containsKey(bookId)) {
            System.out.println("Invalid User ID or Book ID!");
            return false;
        }

        Book book = books.get(bookId);
        book.returnBook();
        users.get(userId).returnBook(bookId);
        System.out.println("Book returned successfully!");
        return true;
    }

    public void displayBooks() {
        System.out.println("\n--- Library Books ---");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }

    public void displayUsers() {
        System.out.println("\n--- Library Users ---");
        for (User user : users.values()) {
            System.out.println(user);
        }
    }
}