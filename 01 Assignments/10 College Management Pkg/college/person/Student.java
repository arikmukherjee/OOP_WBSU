package college.person;

import college.interfacepkg.PersonInterface;

public class Student extends Person implements PersonInterface {

    private int marks;

    public Student(String name, int age, int marks) {
        super(name, age);
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}