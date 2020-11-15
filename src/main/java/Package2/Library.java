package Package2;
import Package1.*;

public class Library {
    private String libName;
    private Book [] listBooks; // Danh mục sách của thư viện
    
    public Library(String libName){
        this.libName = libName;
        System.out.println(libName);
    }
    
    public Library(String libName, Book [] listBooks){
        this.libName = libName;
        this.listBooks = listBooks;
        System.out.println("The Library " + libName);
    }
    
    // setter
    public void setBooks(Book[] listBooks){
        this.listBooks = listBooks;
    }
    
    // getter
    public Book [] getBooks(){
        return listBooks;
    }
}
