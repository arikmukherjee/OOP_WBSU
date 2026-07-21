package university;

public class Admission {
    String course;
    int fee;

    public void getAdmission(String c, int f) {
        course = c;
        fee = f;
    }

    public void showAdmission() {
        System.out.println("Course: " + course);
        System.out.println("Admission Fee: " + fee);
    }
}