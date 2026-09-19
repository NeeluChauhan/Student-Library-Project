package LibraryManagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Library library = new Library();
        while (true) {
            System.out.print("Enter ISBN: ");
            String isbn = sc.nextLine();
            if (!LibraryValidator.isValidIsbn(isbn)) {
                System.out.println("ISBN must be 10 or 13 digits. Book not created.");
                return;
            }
            System.out.print("Enter Title: ");
            String title = sc.nextLine();
            if (!LibraryValidator.isValidTitle(title)) {
                System.out.println("Title must be at least 2 character. Book not created.");
                return;
            }
            System.out.print("Enter Author: ");
            String author = sc.nextLine();
            if (!LibraryValidator.isValidAuthor(author)) {
                System.out.println("Author must be at least 2 character. Book not created.");
                return;
            }
            System.out.print("Enter genre: ");
            String genre = sc.nextLine();
            System.out.print("Enter year: ");
            int publicationYear = sc.nextInt();
            sc.nextLine();
            if (!LibraryValidator.isValidYear(publicationYear)) {
                System.out.println("Year must be between 1800 to 2026. Book not created.");
                return;
            }
            boolean isAvailable = true;

            Book book = new Book(isbn, title, author, genre, publicationYear, isAvailable);
           library.addBook(book);
            System.out.println(book);
            System.out.println("Book added successfully.");
            System.out.print("Do you want to add another book? yes or no: ");
            String input= sc.nextLine();
            if (!input.equalsIgnoreCase("yes")){
                System.out.println("Thank you! Visit again.");
                break;
            }
        }

    }
}
