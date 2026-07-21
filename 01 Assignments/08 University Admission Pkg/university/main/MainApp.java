package university.main;

import university.admission.Admission;
import university.student.Student;

public class MainApp {

    public static void main(String[] args) {

        Student s1 = new Student("Arik", 75);
        Student s2 = new Student("Rahul", 50);

        Admission admission = new Admission();

        admission.displayResult(s1);
        admission.displayResult(s2);
    }
}