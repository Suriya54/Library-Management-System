public class Book {
    private String title;
    private String author;
    private String bookId;
    private int totalCopies;
    private int availableCopies;

    public Book(String title, String author, String bookId, int totalCopies) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
        this.totalCopies = totalCopies;
        this.availableCopies = totalCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookId() {
        return bookId;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public boolean isAvailable() {
        return availableCopies > 0;
    }

    public void borrowBook() {
        if (availableCopies > 0) availableCopies--;
    }

    public void returnBook() {
        if (availableCopies < totalCopies) availableCopies++;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (ID: " + bookId + ") - Available: " + availableCopies + "/" + totalCopies;
    }

}
