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
    for (Book b: bookArrayList){
        System.out.println(b);
    }
    }
}
