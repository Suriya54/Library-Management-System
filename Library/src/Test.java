import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Users");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Add Book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter total copies: ");
                    int copies = scanner.nextInt();
                    library.addBook(new Book(title, author, bookId, copies));
                    System.out.println("Book added successfully!");
                    break;

                case 2: // Add User
                    System.out.print("Enter user ID: ");
                    String userId = scanner.nextLine();
                    System.out.print("Enter user name: ");
                    String name = scanner.nextLine();
                    library.addUser(new User(userId, name));
                    System.out.println("User added successfully!");
                    break;

                case 3: // Issue Book
                    System.out.print("Enter user ID: ");
                    String issueUserId = scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    String issueBookId = scanner.nextLine();
                    library.issueBook(issueUserId, issueBookId);
                    break;

                case 4: // Return Book
                    System.out.print("Enter user ID: ");
                    String returnUserId = scanner.nextLine();
                    System.out.print("Enter Book ID: ");
                    String returnBookId = scanner.nextLine();
                    library.returnBook(returnUserId, returnBookId);
                    break;

                case 5: // Display Books
                    library.displayBooks();
                    break;

                case 6: // Display Users
                    library.displayUsers();
                    break;

                case 7: // Exit
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
