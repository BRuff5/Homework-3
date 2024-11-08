import java.util.ArrayList;
import java.util.List;

// Book INFO 1
abstract class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean isCheckedOut;

    // Book INFO 2
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.isCheckedOut = false;
    }

    // Book check out
    public void checkOut() {
        this.isCheckedOut = true;
    }

    // Book Return
    public void returnBook() {
        this.isCheckedOut = false;
    }

    // Describing the type of the book 
    public abstract String describe();

    @Override
    public String toString() {
        return title + " by " + author + " (ISBN: " + ISBN + ") - " + (isCheckedOut ? "Checked out" : "Available");
    }
}


// Person checking out the book
abstract class Person {
    private String name;
    private String id;

    // Constructor
    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method to describe the person type
    public abstract String describe();

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

// Fiction Books
class Fiction extends Book {
    public Fiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public String describe() {
        return "This is a fiction book.";
    }
}

// NonFiction Books
class NonFiction extends Book {
    public NonFiction(String title, String author, String ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public String describe() {
        return "This is a non-fiction book.";
    }
}

// Library Members
class Member extends Person {
    public Member(String name, String id) {
        super(name, id);
    }

    @Override
    public String describe() {
        return "This is a library member.";
    }
}

// Library Staff
class Staff extends Person {
    public Staff(String name, String id) {
        super(name, id);
    }

    // New member of library staff
    public void registerMember(Library library, Member member) {
        library.registerMember(member);
    }

    // New book in the library
    public void registerBook(Library library, Book book) {
        library.addBook(book);
    }

    @Override
    public String describe() {
        return "This is library staff.";
    }
}

// Library Class
class Library {
    private List<Book> books;
    private List<Member> members;
    private List<Staff> staff;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

    // Add a new book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Register a new member to the library
    public void registerMember(Member member) {
        members.add(member);
    }

    // List all books
    public void listBooks() {
        System.out.println("Books in Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // List all members
    public void listMembers() {
        System.out.println("Library Members:");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    // List all staff
    public void listStaff() {
        System.out.println("Library Staff:");
        for (Staff staffMember : staff) {
            System.out.println(staffMember);
        }
    }

    // Method to add Staff
    public void addStaff(Staff staffMember) {
        staff.add(staffMember);
    }
}

// Main Class (Displays ALL INFO)
public class LibraryManagementSystem {
    public static void main(String[] args) {

        Library library = new Library();
        
        //1
        Staff staff1 = new Staff("Stephen Smith", "S00668425");
        library.addStaff(staff1);
        
        Member member1 = new Member("Ramiyah Long", "V01664428");
        staff1.registerMember(library, member1);
        
        Book book1 = new Fiction("Kindred", "Octavia E. Butler", "7364928364");
        staff1.registerBook(library, book1);

        //2
        Staff staff2 = new Staff("Marshall Brown", "S0069405");
        library.addStaff(staff2);
        
        Member member2 = new Member("Taylor Watson", "V90490848");
        staff1.registerMember(library, member2);
        
        Book book2 = new Fiction("Wonder", "R.J. Palacio", "73949784809");
        staff1.registerBook(library, book2);

        //3
        Staff staff3 = new Staff("Rose Bryd", "S00874836");
        library.addStaff(staff3);
        
        Member member3 = new Member("Christen Sellers", "V0746978748");
        staff1.registerMember(library, member3);
        
        Book book3 = new NonFiction("Bud, Not Buddy", "Christopher Paul Curtis", "37782646828");
        staff1.registerBook(library, book3);

        //4
        Staff staff4 = new Staff("Stephen Smith", "S00668425");
        library.addStaff(staff4);
        
        Member member4 = new Member("Darria Hunter", "V094903428");
        staff1.registerMember(library, member4);
        
        Book book4 = new Fiction("Fahrenheit 451", "Ray Bradbury", "897709028904");
        staff1.registerBook(library, book4);

        //5
        Staff staff5 = new Staff("Marshall Brown", "S0069405");
        library.addStaff(staff5);
        
        Member member5 = new Member("Tristen Wright", "V00984428");
        staff1.registerMember(library, member5);
        
        Book book5 = new NonFiction("The Art of Being ALONE: Solitude Is My HOME, Loneliness Was My Cage", "Renuka Gavrani", "7490727370949");
        staff1.registerBook(library, book5);
        
        library.listBooks();
        library.listMembers();
        library.listStaff();
    }
}