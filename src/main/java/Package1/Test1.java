package Package1;

public class Test1 {
    public static void main(String [] args){
        // Cách 1
        BirthDate birthDate = new BirthDate(14, 2, 1970);
        Address address = new Address(24, "Hai Ba Trung", "1", "HCMC");
        Author author = new Author("An", "Nguyen", birthDate, address);
        Book book1 = new Book("Java Programming", author, 2020);
        
        // Cách 2
        Book book2 = new Book("C++ Programming", new Author("Binh", "Tran", new BirthDate(8, 3, 1980), new Address(10, "Tran hung Dao", "1", "HCMC")), 2020);
        
        book1.printBook();
        book2.printBook();
    }
}
