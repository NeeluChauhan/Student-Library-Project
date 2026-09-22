package LibraryManagement;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String genre;
    private int publicationYear;
    private boolean isAvailable;

    Book(String isbn, String title, String author, String genre, int publicationYear, boolean isAvailable){
        this.isbn= isbn;
        this.title= title;
        this.author= author;
        this.genre= genre;
        this.publicationYear= publicationYear;
        this.isAvailable= isAvailable;
    }
    public String getIsbn(){ return isbn; }
    public String getTitle(){ return title; }
    public String getAuthor(){ return author; }
    public String getGenre(){ return genre; }
    public int getPublicationYear(){ return publicationYear; }
    public boolean getIsAvailable(){ return isAvailable;
    }

    public void setIsbn(String isbn){ this.isbn= isbn;}
    public void setTitle(String title){ this.title= title; }
    public void setAuthor(String author){ this.author= author; }
    public void setGenre(String genre){ this.genre= genre; }
    public void setPublicationYear(int publicationYear){ this.publicationYear= publicationYear; }
    public void setIsAvailable(boolean isAvailable){ this.isAvailable= isAvailable; }

    public String toString(){
        return "[" +getIsbn()+ "] " +getTitle()+ " by " +getAuthor()+ "( " +getGenre()+ "," +getPublicationYear()+ " ) - " +(getIsAvailable()? "Available" : "Borrowed");
    }
}

