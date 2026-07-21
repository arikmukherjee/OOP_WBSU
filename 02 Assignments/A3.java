class Hospital {
    String hospitalName;
    String location;

    void ip1(String name, String loc) {
        hospitalName = name;
        location = loc;
    }
    void display1() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}

class Doctor extends Hospital {
    String doctorName;
    String specialization;

    void ip2(String dName, String spec) {
        doctorName = dName;
        specialization = spec;
    }

    void display2() {
        display1();
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}

class Patient extends Doctor {
    String patientName;
    int age;

    void ip3(String pName, int a) {
        patientName = pName;
        age = a;
    }

    void display3() {
        display2();
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }
}

// Main Class
public class A3 {
    public static void main(String[] args) {

        Patient p = new Patient();

        p.ip1("City Hospital", "Kolkata");
        p.ip2("Dr. Sharma", "Cardiology");
        p.ip3("Sourath", 25);
        p.display3();
    }
}