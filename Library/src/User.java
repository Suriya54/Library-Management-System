import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private List<String> borrowedBooks; // Stores bookIds of borrowed books

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public List<String> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(String bookId) {
        borrowedBooks.add(bookId);
    }

    public void returnBook(String bookId) {
        borrowedBooks.remove(bookId);
    }

    @Override
    public String toString() {
        return "User: " + name + " (ID: " + userId + ") - Borrowed Books: " + borrowedBooks.size();
    }


}