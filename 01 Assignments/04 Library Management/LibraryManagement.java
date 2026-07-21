// Base Class
class Library {
    String libraryName;
    String location;

    // Method 1
    void inputLibrary(String name, String loc) {
        libraryName = name;
        location = loc;
    }

    // Method 2
    void displayLibrary() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + location);
    }
}

// Derived Class (Level 1)
class Book extends Library {
    String bookName;
    String author;

    // Method 1
    void inputBook(String bname, String auth) {
        bookName = bname;
        author = auth;
    }

    // Method 2
    void displayBook() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
    }
}

// Derived Class (Level 2)
class Member extends Book {
    String memberName;
    int memberId;

    // Method 1
    void inputMember(String mname, int id) {
        memberName = mname;
        memberId = id;
    }

    // Method 2
    void displayMember() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}

// Main Class
public class LibraryManagement {
    public static void main(String[] args) {
        Member obj = new Member();

        obj.inputLibrary("Central Library", "Kolkata");
        obj.inputBook("Java Programming", "James Gosling");
        obj.inputMember("Arik", 101);

        obj.displayLibrary();
        obj.displayBook();
        obj.displayMember();
    }
}