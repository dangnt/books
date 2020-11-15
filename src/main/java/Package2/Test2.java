package Package2;
import Package1.*;

public class Test2 {
    public static void main(String [] args){
        Book [] books1 = new Book[2];
        Book [] books2 = new Book[2];
        
        Library lib = new Library("The Library of University");
        
        BirthDate birthDate1 = new BirthDate(14, 2, 1970);
        Address address1 = new Address(24, "Hai Ba Trung", "1", "HCMC");
        Author author1 = new Author("An", "Nguyen", birthDate1, address1);
        books1[0] = new Book("Java Programming", author1, 2020);
        
        BirthDate birthDate2 = new BirthDate(8, 3, 1980);
        Address address2 = new Address(10, "Tran hung Dao", "1", "HCMC");
        Author author2 = new Author("Binh", "Tran", birthDate2, address2);
        books1[1] = new Book("C++ Programming", author2, 2020);
        
        // Đưa books1 vào lib
        lib.setBooks(books1);
        // Truy xuất danh mục sách của lib để gán cho books2
        books2 = lib.getBooks();
        
        System.out.println("The list of books in library:");
        
        for (Book bk : books2){ // for each bk in books2
            bk.printBook();
        }
    }
}
