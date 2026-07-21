package P2;

public class Student implements Person {
    String name;
    int age;

    public void getData(String n, int a) {
        name = n;
        age = a;
    }

    public void showData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}