// Base Class
class Railway {
    String railwayName;
    String zone;

    // Method 1
    void inputRailway(String name, String z) {
        railwayName = name;
        zone = z;
    }

    // Method 2
    void displayRailway() {
        System.out.println("Railway Name: " + railwayName);
        System.out.println("Zone: " + zone);
    }
}

// Derived Class (Level 1)
class Train extends Railway {
    String trainName;
    int trainNumber;

    // Method 1
    void inputTrain(String tname, int tnum) {
        trainName = tname;
        trainNumber = tnum;
    }

    // Method 2
    void displayTrain() {
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Number: " + trainNumber);
    }
}

// Derived Class (Level 2)
class Passenger extends Train {
    String passengerName;
    int age;

    // Method 1
    void inputPassenger(String pname, int a) {
        passengerName = pname;
        age = a;
    }

    // Method 2
    void displayPassenger() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Age: " + age);
    }
}

// Main Class
public class RailwayManagement {
    public static void main(String[] args) {
        Passenger obj = new Passenger();

        obj.inputRailway("Indian Railways", "Eastern Zone");
        obj.inputTrain("Howrah Express", 12345);
        obj.inputPassenger("Arik", 22);

        obj.displayRailway();
        obj.displayTrain();
        obj.displayPassenger();
    }
}