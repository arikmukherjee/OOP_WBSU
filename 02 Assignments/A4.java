class Library {
    String libraryName;
    String location;

    void ip1(String name, String loc) {
        libraryName = name;
        location = loc;
    }

    void display1() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("Location: " + location);
    }
}

class Librarian extends Library {
    String librarianName;
    String section;

    void ip2(String lName, String sec) {
        librarianName = lName;
        section = sec;
    }

    void display2() {
        display1();
        System.out.println("Librarian Name: " + librarianName);
        System.out.println("Section: " + section);
    }
}
class Member extends Librarian {
    String memberName;
    int memberId;

    void ip3(String mName, int id) {
        memberName = mName;
        memberId = id;
    }

    void display3() {
        display2();
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
    }
}

public class A4 {
    public static void main(String[] args) {

        Member m = new Member();

        m.ip1("Central Library", "Kolkata");
        m.ip2("Mr. Sen", "Science");
        m.ip3("Goutam", 101);

        m.display3();
    }
}