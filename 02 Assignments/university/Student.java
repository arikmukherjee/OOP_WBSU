package university;

public class Student {
    String name;
    int age;

    public void getStudent(String n, int a) {
        name = n;
        age = a;
    }

    public void showStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}