package LibraryManagement;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> bookArrayList= new ArrayList<>();
    ArrayList<Student> studentArrayList= new ArrayList<>();

    public void addBook(Book book){
      bookArrayList.add(book);
    }

    public void addStudent(Student student){
      studentArrayList.add(student);
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
}