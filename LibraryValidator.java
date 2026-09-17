package LibraryManagement;

public class LibraryValidator {
    public static boolean isValidIsbn(String isbn){
        if (isbn==null){
            return false;
        }
        int length= isbn.trim().length();
        return length==10 || length==13;
    }

    public static boolean isValidTitle(String title){
        if (title==null || title.length()<2) return false;
        return true;
    }

    public static boolean isValidAuthor(String author){
        if (author==null || author.length()<2) return false;
        return true;
    }

    public static boolean isValidYear(int year){
        if (year<1800 || year>2026) return false;
        return true;
    }
}
