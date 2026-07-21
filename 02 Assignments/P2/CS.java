package P2;

public class CS extends Student {
    String course;
    int fee;

    public void getCollegeData(String c, int f) {
        course = c;
        fee = f;
    }

    public void showCollegeData() {
        System.out.println("Course: " + course);
        System.out.println("Fee: " + fee);
    }
}