package LibraryManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc= new Scanner(System.in);

    public Book inputToAddBook(String isbn) {

            System.out.print("Enter Title: ");
        String title = sc.nextLine();
            if (!LibraryValidator.isValidTitle(title)) {
                return null;
            }

            System.out.print("Enter Author: ");
        String author = sc.nextLine();
            if (!LibraryValidator.isValidAuthor(author)) {
                return null;
            }

            System.out.print("Enter genre: ");
        String genre = sc.nextLine();

            System.out.print("Enter year: ");
        int publicationYear = sc.nextInt();
            sc.nextLine();
            if (!LibraryValidator.isValidYear(publicationYear)) {
                return null;
            }
        boolean isAvailable = true;
            return new Book(isbn, title, author, genre, publicationYear, isAvailable);
    }

    public void editBook(Book book){
        System.out.print("Enter new title (Press enter to skip): ");
        String newTitle= sc.nextLine();
        if (!newTitle.isEmpty()) {
            book.setTitle(newTitle);
        }
        System.out.print("Enter new author (Press enter to skip): ");
        String newAuthor= sc.nextLine();
        if (!newAuthor.isEmpty()) {
            book.setAuthor(newAuthor);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        Library library = new Library();

        while (true) {
            System.out.println("What you want to do: ");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Books");
            System.out.println("3. Edit Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Show Total Book Count");
            System.out.println("6. Search Book By Title/Author");
            System.out.println("7. View Books by Genre");
            System.out.print("Pres 0 to Exit.");
            int input = main.sc.nextInt();
            main.sc.nextLine();
            switch (input) {
                case 1:
                    System.out.print("Enter ISBN: ");
                    String isbn = main.sc.nextLine();
                    if (!LibraryValidator.isValidIsbn(isbn)) {
                        break;
                    }
                    if (library.findBookByIsbn(isbn)!=null){
                        System.out.println("Book with ISBN " +isbn+ " is already exist. Entry skipped.");
                        break;
                    }
                    Book book = main.inputToAddBook(isbn);
                    if (book != null) {
                        if (library.addBook(book)){
                            System.out.println("Book added successfully.");
                            System.out.println("--------------------------");
                        }
                    }
                    break;

                case 2:
                    library.printAllBooks();
                    break;

                case 3:
                    System.out.print("Enter ISBN to edit: ");
                    String newIsbn = main.sc.nextLine();
                    if (LibraryValidator.isValidIsbn(newIsbn)) {
                        Book bookToEdit = library.findBookByIsbn(newIsbn);
                        if (bookToEdit!=null) {
                            System.out.println("[Editing]:" +bookToEdit);
                            main.editBook(bookToEdit);
                            System.out.println("Book updated successfully.");
                        }
                        else {
                            System.out.println("Book not found.");
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter ISBN to delete: ");
                    String dISbn= main.sc.nextLine();
                    if (LibraryValidator.isValidIsbn(dISbn)) {
                        if (library.deleteBook(dISbn)) {
                            System.out.println("Book deleted successfully.");
                        }
                        else {
                            System.out.println("Book not found.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Total books in library: " +library.getTotalBookCount());
                    break;

                case 6:
                    System.out.print("Enter search keyword: ");
                    String keyword= main.sc.nextLine();
                    ArrayList<Book> foundBook= library.searchBook(keyword);
                    if (!foundBook.isEmpty()){
                        System.out.println("Found " +foundBook.size()+ " match(es):");
                        for (Book b: foundBook){
                            System.out.println(b);
                        }
                    }
                    else{
                        System.out.println("No book found.");
                    }
                    break;

                case 7:
                    library.viewBookByGenre();
                    break;

                case 0:
                    System.out.println("Thank you! Visit Again.");
                    return;

                default:
                    System.out.println("Please enter valid input.");

            }

        }

    }
}
