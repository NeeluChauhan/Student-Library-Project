package LibraryManagement;

public class Main {

    public static void main(String[] args) {
        String isbn= "123456789";
        String title= "Half girlfriend";
        String author= "Chetan Bhagat";
        String genre= "Novel";
        int publicationYear= 1800;
        boolean isAvailable= true;
        if (!LibraryValidator.isValidIsbn(isbn)) {
            System.out.println("ISBN must be 10 or 13 digits. Book not created.");
        }
        else if (!LibraryValidator.isValidTitle(title)) {
            System.out.println("Title must be at least 2 character. Book not created.");
        }
        else if (!LibraryValidator.isValidAuthor(author)) {
            System.out.println("Author must be at least 2 character. Book not created.");
        }
        else if (!LibraryValidator.isValidYear(publicationYear)) {
            System.out.println("Year must be between 1800 to 2026. Book not created.");
        }
        else{
        Book book = new Book(isbn, title, author, genre, publicationYear, isAvailable);
            System.out.println(book);
        }
    }
}
