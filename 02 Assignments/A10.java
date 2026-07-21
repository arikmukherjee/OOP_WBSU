import P2.CS;

public class A10 {
    public static void main(String[] args) {
        CS cs = new CS();

        cs.getData("Rupam Sen", 22);
        cs.getCollegeData("BCA", 50000);

        System.out.println("Student Details: ");
        cs.showData();
        cs.showCollegeData();
    }
}