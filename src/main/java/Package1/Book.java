package Package1;

public class Book {
    private String title;
    private int year;
    private final Author author; // COMPOSITION
    
    public Book(String title, Author author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    // setters
    void setTitle(String title){    // This is a setter method
        this.title = title;
    }
    
    // getters
    String getTitle(){  // This is a getter method
        return title;
    }
    
    void setYear(int year){    // This is a setter method
        this.year = year;
    }
    
    int getYear(){  // This is a getter method
        return year;
    }
    
    public void printBook(){ 
        System.out.println(title + "\n" + author.printAuthor() + "\n" + year);
    }
}
