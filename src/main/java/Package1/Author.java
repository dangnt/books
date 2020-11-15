package Package1;

public class Author {
    private String firstName; // Tên
    private String lastName; // Họ
    private final BirthDate birthDate;  // COMPOSITION
    private final Address address; // COMPOSITION
    
    public Author(String firstName, String lastName, BirthDate birthDate, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
    }
    
    public String printAuthor(){
        return firstName + "\t" + lastName;
    }
}
