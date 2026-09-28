package LibraryManagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    ArrayList<Book> bookArrayList= new ArrayList<>();

    public boolean addBook(Book book){
        return bookArrayList.add(book);
    }

    public void printAllBooks(){
        if (!bookArrayList.isEmpty()) {
            System.out.println("List of All Books:---");
            for (Book b : bookArrayList) {
                System.out.println(b);
            }
        }
        else {
            System.out.println("No book found.");
        }
    }
    public Book findBookByIsbn(String isbn) {
        for (Book b : bookArrayList) {
            if (b.getIsbn().equals(isbn)) {
                return b;
            }
        }
        return null;
    }

    public boolean deleteBook(String isbn){
        Book book= findBookByIsbn(isbn);
        if (book!=null){
            bookArrayList.remove(book);
            return true;
        }
       return false;
    }

    public int getTotalBookCount(){
           return bookArrayList.size();
    }

    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> matchingBooks= new ArrayList<>();
        for (Book b : bookArrayList) {
            if (b.getAuthor().toLowerCase().contains(keyword.toLowerCase()) || b.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                matchingBooks.add(b);
            }
        }
        return matchingBooks;
    }

    public void viewBookByGenre(){
        if (bookArrayList.isEmpty()){
            System.out.println("No books have been added yet.");
        }
        ArrayList<String> genre= new ArrayList<>();
    for (Book b: bookArrayList){
        if (!genre.contains(b.getGenre())){
            genre.add(b.getGenre());
        }
    }
    for (String gen: genre){
        System.out.println("Genre: " +gen);
    for (Book b: bookArrayList) {
        if (b.getGenre().equals(gen)) {
            System.out.println(b);
        }
    }
    }
    }

    public void printGenreCounts(){
        if (bookArrayList.isEmpty()){
            System.out.println("No books have been added yet.");
        }
     ArrayList<String> countGenre= new ArrayList<>();
     for (Book b: bookArrayList){
         if (!countGenre.contains(b.getGenre())){
             countGenre.add(b.getGenre());
         }
     }
     for (String gen: countGenre){
         int count= 0;
         for (Book b: bookArrayList){
             if (b.getGenre().equals(gen)){
                 count++;
             }
         }
         System.out.println(gen+ "=" +count);
     }
    }
}