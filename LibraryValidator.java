package LibraryManagement;

public class LibraryValidator {

    public static boolean isValidIsbn(String isbn){
        if (isbn==null){
            System.out.println("ISBN must be 10 or 13 digits. Book not created.");
            return false;
        }
        int length= isbn.trim().length();
        if(length!=10 && length!=13){
            System.out.println("ISBN must be 10 or 13 digits. Book not created.");
            return false;
        }
        return true;
    }

    public static boolean isValidTitle(String title){
        if (title==null || title.length()<2) {
            System.out.println("Title must be at least 2 character. Book not created.");
            return false;
        }
        return true;
    }

    public static boolean isValidAuthor(String author){
        if (author==null || author.length()<2){
            System.out.println("Author must be at least 2 character. Book not created.");
            return false;
        }
        return true;
    }

    public static boolean isValidYear(int year){
        if (year<1800 || year>2026){
            System.out.println("Year must be between 1800 to 2026. Book not created.");
            return false;
        }
        return true;
    }
}
