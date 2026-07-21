package university.admission;

import university.student.Student;

public class Admission {

    private int cutoff = 60;

    public boolean checkEligibility(Student s) {
        if (s.getMarks() >= cutoff) {
            return true;
        } else {
            return false;
        }
    }

    public void displayResult(Student s) {
        if (checkEligibility(s)) {
            System.out.println(s.getName() + " is Eligible for Admission.");
        } else {
            System.out.println(s.getName() + " is Not Eligible for Admission.");
        }
    }
}