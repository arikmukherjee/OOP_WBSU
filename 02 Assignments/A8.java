import university.Student;
import university.Admission;

import java.util.Scanner;
public class A8 {
    public static void main(String[] args) {
        Student s = new Student();
        Admission a = new Admission();

        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student Age: ");
        int age = sc.nextInt();
        s.getStudent(name, age );
        
        System.out.println("Enter Course: ");
        String course = sc.next();
        System.out.println("Enter Admission Fee: ");
        int fee = sc.nextInt();
        a.getAdmission(course, fee);

        System.out.println("University Admission Details: ");
        s.showStudent();
        a.showAdmission();
    }
}