// Base Class
class Hospital {
    String hospitalName;
    String location;

    // Method 1
    void inputHospital(String name, String loc) {
        hospitalName = name;
        location = loc;
    }

    // Method 2
    void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}

// Derived Class (Level 1)
class Doctor extends Hospital {
    String doctorName;
    String specialization;

    // Method 1
    void inputDoctor(String dname, String spec) {
        doctorName = dname;
        specialization = spec;
    }

    // Method 2
    void displayDoctor() {
        System.out.println("Doctor Name: " + doctorName);
        System.out.println("Specialization: " + specialization);
    }
}

// Derived Class (Level 2)
class Patient extends Doctor {
    String patientName;
    int age;

    // Method 1
    void inputPatient(String pname, int a) {
        patientName = pname;
        age = a;
    }

    // Method 2
    void displayPatient() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
    }
}

// Main Class
public class HospitalManagement {
    public static void main(String[] args) {
        Patient obj = new Patient();

        obj.inputHospital("City Hospital", "Kolkata");
        obj.inputDoctor("Dr. Sen", "Cardiology");
        obj.inputPatient("Rahul", 25);

        obj.displayHospital();
        obj.displayDoctor();
        obj.displayPatient();
    }
}